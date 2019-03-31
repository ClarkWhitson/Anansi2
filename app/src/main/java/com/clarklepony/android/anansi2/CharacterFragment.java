package com.clarklepony.android.anansi2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clarklepony.android.anansi2.databinding.FragmentCharacterBinding;
import com.clarklepony.android.anansi2.databinding.ListItemCharacterBinding;

/*
This class is responsible for managing our CharacterFragment.
 */

public class CharacterFragment extends Fragment {

    public static CharacterFragment newInstance() {
        return new CharacterFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentCharacterBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_character, container, false);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        //This is where we wire up our CharacterAdapter
        binding.recyclerView.setAdapter(new CharacterAdapter());


        return binding.getRoot();

    }

    /*
    Here we create a CharacterHolder wired up to list_item_character.
    The CharacterHolder expects the binding class we just implicitly created:
    ListItemCharacterBinding
     */

    private class CharacterHolder extends RecyclerView.ViewHolder {
        private ListItemCharacterBinding mBinding;

        private CharacterHolder(ListItemCharacterBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }

    /*
    Next, we create an Adapter hooked up to CharacterHolder.
     */

    private class CharacterAdapter extends RecyclerView.Adapter<CharacterHolder> {
        @Override
        public CharacterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            ListItemCharacterBinding binding = DataBindingUtil
                    .inflate(inflater, R.layout.list_item_character, parent, false);
            return new CharacterHolder(binding);
        }

        @Override
        public void onBindViewHolder(CharacterHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
