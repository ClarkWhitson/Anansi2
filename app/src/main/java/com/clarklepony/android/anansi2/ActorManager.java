package com.clarklepony.android.anansi2;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
We're going to store our list of characters in this class -- a singleton.
The class has a private constructor and a get() method. If the instance already exists
then get() will just return the instance. If the instance doesn't exist yet, then
get() will call the constructor to create it.

This is not a solution for long term data -- see chapter 14 of the BNR book when
ready to figure that piece out.
 */


/*
There are a few interesting things in this ActorManager implementation. First, notice the s prefix on the sCrimeLab
variable. You are using this Android convention to make it clear that sCrimeLab is a static variable.
Also, notice the private constructor on the CrimeLab. Other classes will not be able to create a CrimeLab, bypassing
the get() method.
Finally, in the get() method on CrimeLab, you pass in a Context object. You will make use of this Context object
in Chapter 14.
Let’s give CrimeLab some Crime objects to store. In CrimeLab’s constructor, create an empty List of Crimes. Also,
add two methods: a getCrimes() method that returns the List and a getCrime(UUID) that returns the Crime with
the given ID
 */

//implementing ActorManager as a singleton with a private constructor and a get() method.
public class ActorManager {
    private static ActorManager sActorBuilder;

    private List<Actor> mActors = new ArrayList<>();


    public static ActorManager get(Context context) {
        if (sActorBuilder == null) {
            sActorBuilder = new ActorManager(context);
        }
        return sActorBuilder;
    }

    public ActorManager(Context context) {
        // we'll generate a list off 100 actors here just to test things out
        mActors = new ArrayList<>();
        for (int a = 1; a <= 50; a++) {
            Actor actor = new Actor("Character #" + a, UUID.randomUUID());
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