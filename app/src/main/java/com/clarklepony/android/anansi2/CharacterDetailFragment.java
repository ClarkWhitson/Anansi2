package com.clarklepony.android.anansi2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clarklepony.android.anansi2.databinding.CharacterDetailFragmentBinding;

/*
This is the fragment responsible for managing our character list activity.
 */

public class CharacterDetailFragment extends Fragment {

    public static CharacterDetailFragment newInstance() {
        return new CharacterDetailFragment();
    }

    @Override

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    // bind it to the corresponding layout file

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        CharacterDetailFragmentBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.character_detail_fragment,
                        container, false);

        return binding.getRoot();
    }


}
