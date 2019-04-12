package com.apps.nb2998.learningDagger2;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void drive() {
        Log.d(TAG, "drive: Diesel engine started");
    }
}
