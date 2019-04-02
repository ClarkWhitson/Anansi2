package com.clarklepony.android.anansi2;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
This class stores the list of characters used by the RecyclerView
 */


public class ActorManager {
    private static ActorManager sActorManager;

    private List<Actor> mActors = new ArrayList<>();


    public static ActorManager get(Context context) {
        if (sActorManager == null) {
            sActorManager = new ActorManager(context);
        }
        return sActorManager;
    }

    public ActorManager(Context context) {
        // we'll generate a list off 50 actors here just to test things out
        mActors = new ArrayList<>();
        for (int a = 1; a <= 50; a++) {
            Actor actor = new Actor();
            actor.setName("Character #" + a);
            mActors.add(actor);
        }
    }

    public List<Actor> getActors(){
        return mActors;
    }

    public Actor getActor(UUID id) {
        for (Actor actor : mActors) {
            if (actor.getId().equals(id)) {
                return actor;
            }
        }

        return null;
    }
}