package com.apps.nb2998.learningDagger2;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {

    }

    @Override
    public void drive() {
        Log.d(TAG, "drive: Petrol engine started");
    }
}
