package com.clarklepony.android.anansi2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

/*
This is our app's third activity, allowing to swipe between different characters on the fly.
Due to time constraints, I wasn't able to figure out how to implement it properly while leveraging
MVVM architecture.
 */

public class CharacterPagerActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<Actor> mActors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_pager);

        mViewPager = (ViewPager) findViewById(R.id.character_view_pager);

        mActors = ActorManager.get(this).getActors();
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {

            @Override
            public Fragment getItem(int position) {
                Actor actor = mActors.get(position);
                // couldn't figure out how to make tis work with MVVM architecture in time
                return null;
            }

            @Override
            public int getCount() {
                return mActors.size();
            }
        });
    }
}
