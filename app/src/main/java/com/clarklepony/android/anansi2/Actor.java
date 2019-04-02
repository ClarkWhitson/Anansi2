package com.clarklepony.android.anansi2;

/*
This class is responsible for keeping track of characters' names, as well
as any other information relating to a given character.
 */

import android.util.Log;

import java.util.UUID;

public class Actor {


    private UUID mId;
    private String mName;

    public Actor() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }


}
