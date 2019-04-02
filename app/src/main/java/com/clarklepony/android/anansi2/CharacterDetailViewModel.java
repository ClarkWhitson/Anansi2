package com.clarklepony.android.anansi2;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

//This is the viewmodel class responsible for deciding how things should be displayed in
//the CharacterDetailFragment

public class CharacterDetailViewModel extends BaseObservable {

    private Actor mActor;
    private ActorManager mActorManager;

    public CharacterDetailViewModel(Actor actor){
        mActor = actor;
    }

    @Bindable
    public String getName() {
        return mActor.getName();
    }





    /*
    The idea was for this button to transition back to the CharacterListView, but
    I couldn't get it working in time, so unfortunately it does nothing for now.
     */
    public void onButtonClick(View view) {
        Intent intent = new Intent(view.getContext(), CharacterDetailActivity.class);
        view.getContext().startActivity(intent);

    }



}


