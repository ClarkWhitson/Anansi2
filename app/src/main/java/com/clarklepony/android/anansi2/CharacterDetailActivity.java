package com.clarklepony.android.anansi2;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clarklepony.android.anansi2.databinding.ActivityCharacterDetailBinding;

/*
This is the main code for our character detail view activity. It creates a new fragment.
 */

public class CharacterDetailActivity extends SingleFragmentActivity {

    private final String TAG = "CharacterDetailActivity";

    @Override
    protected Fragment createFragment() {
        return CharacterDetailFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = this.getIntent();
        String actorId = intent.getStringExtra("actorID");
        Log.i(TAG, "Actor ID is " + actorId);
    }
}

