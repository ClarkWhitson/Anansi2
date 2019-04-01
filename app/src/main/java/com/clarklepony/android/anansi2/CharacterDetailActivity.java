package com.clarklepony.android.anansi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CharacterDetailActivity extends AppCompatActivity {

    private final String TAG = "CharcterDetailActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_detail);
        String actorId = this.getIntent().getStringExtra("ID");
        Log.i(TAG, "The actor id is " + actorId);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
