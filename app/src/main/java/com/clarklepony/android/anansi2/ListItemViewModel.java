package com.clarklepony.android.anansi2;


/*

This is the ViewModel for our individual character list items
THE VIEW MODEL WILL TAKE ON THE RESPONSIBILITY OF DECIDING HOW THINGS ARE DISPLAYED
 */

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.nfc.Tag;
import android.util.Log;
import android.view.View;

import java.util.UUID;

public class ListItemViewModel extends BaseObservable {

    private final String TAG = "CharacterDetailActivity";

    /*start by giving it two properties: An Actor to use, and an ActorManager
    to display that Actor*/

    private Actor mActor;
    private ActorManager mActorManager;


    public Actor getActor() {
        return mActor;
    }

    public void setActor(Actor actor) {
        mActor = actor;
        notifyChange();
    }

    /* The Properties above are the interface our adapter will use. For the
     * layout file, we want to add an additional method to ge the title that
     * the button should display.
     */
    @Bindable
    public String getName() {
        return mActor.getName();
    }


    /*implement an onclick listener to transition to the character detail
    activity when a character is selected.
    */
    public void onButtonClick(View view) {
        Intent intent = new Intent(view.getContext(), CharacterDetailActivity.class);
        intent.putExtra("actorID", mActor.getId().toString());
        view.getContext().startActivity(intent);
        Log.i(TAG, "The actor id is " + mActor.getId());
    }

}


