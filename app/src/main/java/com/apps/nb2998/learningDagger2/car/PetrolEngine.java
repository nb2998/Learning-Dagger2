package com.apps.nb2998.learningDagger2.car;

import android.util.Log;

import com.apps.nb2998.learningDagger2.car.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
//    private static final String TAG = "Car";
//
//    @Inject
//    public PetrolEngine() {
//
//    }
//
//    @Override
//    public void drive() {
//        Log.d(TAG, "drive: Petrol engine started");
//    }

    //    More efficient way: passing hp to constructor directly
    private static final String TAG = "Car";
    private int horsepower;

    @Inject
    public PetrolEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void drive() {
        Log.d(TAG, "drive: Petrol engine started. HP= " + this.horsepower);
    }
}
