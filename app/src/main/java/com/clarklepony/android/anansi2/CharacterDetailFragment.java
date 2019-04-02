package com.clarklepony.android.anansi2;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clarklepony.android.anansi2.databinding.ActivityCharacterDetailBinding;

/*
This is the fragment responsible for managing our character list activity.
 */

public class CharacterDetailFragment extends Fragment {

    public static CharacterDetailFragment newInstance() {
        return new CharacterDetailFragment();
    }

    @Override
    // @Nullable means that the bundle could be empty
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    
    //   String actorId = this.getIntent().getStringExtra("actorID");
    //   Log.i(TAG, "The actor id is " + actorId);
    //   private final String TAG = "CharacterDetailActivity";


    // bind it to the corresponding layout file

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ActivityCharacterDetailBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.activity_character_detail,
                        container, false);

        return binding.getRoot();
    }

    /*@Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }*/
}
