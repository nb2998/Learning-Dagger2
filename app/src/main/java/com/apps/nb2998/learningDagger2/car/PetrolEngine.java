package com.apps.nb2998.learningDagger2.car;

import android.util.Log;

import com.apps.nb2998.learningDagger2.car.Engine;

import javax.inject.Inject;
import javax.inject.Named;

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
//    private static final String TAG = "Car";
//    private int horsepower;
//
//    @Inject
//    public PetrolEngine(int horsepower) {
//        this.horsepower = horsepower;
//    }
//
//    @Override
//    public void drive() {
//        Log.d(TAG, "drive: Petrol engine started. HP= " + this.horsepower);
//    }

    // NAMED

    private static final String TAG = "Car";
    private int horsepower, engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsepower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void drive() {
        Log.d(TAG, "drive: Petrol engine started. HP = " + this.horsepower
                + "\n Engine capacity = " + this.engineCapacity);
    }

    // Named can also be used with Provides etc; Not a dagger annotation but a javax annotation
}
