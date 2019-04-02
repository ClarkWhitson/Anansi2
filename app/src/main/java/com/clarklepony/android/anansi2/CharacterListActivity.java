package com.clarklepony.android.anansi2;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;


/*
This is the main activity that will contain our character fragment.
 */

public class CharacterListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return CharacterListFragment.newInstance();
    }
}
