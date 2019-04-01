package com.clarklepony.android.anansi2;

import android.support.v4.app.Fragment;


/*
This is the main activity that will contain our character fragment.
 */

public class CharacterListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return CharacterListFragment.newInstance();
    }
}
