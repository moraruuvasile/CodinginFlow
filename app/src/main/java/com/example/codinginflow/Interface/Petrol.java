package com.example.codinginflow.Interface;

import android.util.Log;

import javax.inject.Inject;

class Petrol implements Engine2 {
    private static final String TAG = "Engine";

    @Inject
    public Petrol() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Petrol");
    }
}
