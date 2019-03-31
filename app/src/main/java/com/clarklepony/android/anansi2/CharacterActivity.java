package com.clarklepony.android.anansi2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/*
This is the main activity that will contain our character fragment.
 */

public class CharacterActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return CharacterFragment.newInstance();
    }
}
