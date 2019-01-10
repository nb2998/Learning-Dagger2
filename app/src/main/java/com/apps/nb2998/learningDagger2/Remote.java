package com.apps.nb2998.learningDagger2;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected ");
    }
}
