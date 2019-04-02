package com.clarklepony.android.anansi2;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/*
The idea here is that this service will be responsible for communicating with a database
that would store the app's data (characters, ect). I did not get far
enough along to implement it, unfortunately.
 */

import static android.content.ContentValues.TAG;

public class AnansiService extends IntentService {

    public static Intent newIntent(Context context) {
        return new Intent(context, AnansiService.class);
    }

    public AnansiService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "Intent received: " + intent);
    }
}
