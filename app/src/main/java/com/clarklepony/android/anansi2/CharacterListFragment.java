package com.clarklepony.android.anansi2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clarklepony.android.anansi2.databinding.FragmentCharacterListBinding;
import com.clarklepony.android.anansi2.databinding.ListItemCharacterBinding;

import java.util.List;

/*
This class is responsible for managing our CharacterListFragment.
 */

public class CharacterListFragment extends Fragment {

    //creating an instance of ActorManager (part 1)
    private ActorManager mActorManager;

    public static CharacterListFragment newInstance() {
        return new CharacterListFragment();
    }

    //creating an instance of ActorManager (part 2)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActorManager = new ActorManager(getActivity());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentCharacterListBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_character_list, container, false);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        //This is where we wire up our CharacterAdapter and pass in ActorManager's
        //list of actors
        binding.recyclerView.setAdapter(new CharacterAdapter(mActorManager.getActors()));


        return binding.getRoot();

    }

    /*

     *The RecyclerView’s only responsibilities are recycling TextViews and positioning them onscreen.
     *To get theT extViews in  the first place, it works with two classes that we have built below:
     *an Adapter subclass and a ViewHolder subclass.

     *Here we create a CharacterHolder wired up to list_item_character.
     *The CharacterHolder expects the binding class we just implicitly created:
     *ListItemCharacterBinding
     */


    /* The ViewHolder's job is small. It does one thing -- it holds on to a View.
    * A RecyclerView never creates views by themselves, they always create ViewHolders
    * which bring their itemViews along for the ride*/
    private class CharacterHolder extends RecyclerView.ViewHolder {
        private ListItemCharacterBinding mBinding;

        private CharacterHolder(ListItemCharacterBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
            // We create a new ViewModel and Attach it to our binding class.
            mBinding.setViewModel(new ListItemViewModel());
        }

        //finally, we add a binding method to our CharacterHolder

        public void bind(Actor actor) {
            mBinding.getViewModel().setActor(actor);
            mBinding.executePendingBindings();
        }
        /*NOTE
        * Calling executePendingBindings() is not normally necessary.
        * Here though, we're updating binding data inside a RecyclerView, which
        * updates at very high speed. By calling this method, we force the layout
        * to immediately update itself, rather than waiting a millisecond or two.
        * This keeps the RecyclerView Looking Spiffy.*/
    }

    /*
    Next, we create an Adapter hooked up to CharacterHolder.
     */


    /*
    RecyclerViews do not create ViewHolders for themselves. Instead, they ask an adapter.
    An adapter is a controller object that sits between the RecyclerView and the data set
    that the RecyclerView should display. It's responsible for:

    1:Creating the necessary ViewHolders, and
    2:Binding ViewHolders to data from the model layer

    To build an adapter, we first define a subclass of RecyclerView.Adapter. Our adapter
    subclass will wrap the list of actors we get from ActorManager.

    When the RecyclerView needs a view object to display, it will have a conversation with
    its adapter. First, RecyclerView asks how many objects are in the list by calling the
    adapter's getItemCount(). method. Then the RecyclerView calls the adapter's
    OnCreateViewHolder(ViewGroup, int) method to create a new ViewHolder, which contains a
    view to display.
     */
    private class CharacterAdapter extends RecyclerView.Adapter<CharacterHolder> {

        //wiring up the character adapter with a list of characters
        private List<Actor> mActors;

        public CharacterAdapter(List<Actor> actors) {
            mActors = actors;
        }

        @Override
        public CharacterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            ListItemCharacterBinding binding = DataBindingUtil
                    .inflate(inflater, R.layout.list_item_character, parent, false);
            return new CharacterHolder(binding);
        }

        @Override
        public void onBindViewHolder(CharacterHolder holder, int position) {
            //Finally, we finish hooking up our model by implementing onBindViewHolder()
            Actor actor = mActors.get(position);
            holder.bind(actor);

        }

        @Override
        public int getItemCount() {
            return mActors.size();
        }
    }
}
