package com.apps.nb2998.learningDagger2.car;

import android.util.Log;

import com.apps.nb2998.learningDagger2.car.Engine;

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
