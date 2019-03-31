package com.clarklepony.android.anansi2;

/*
This class is responsible for keeping track of characters' names (for now), as well
as any other information relating to a given character.
 */

import java.util.UUID;

public class Actor {

    private UUID mId;
    private String mName;

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
