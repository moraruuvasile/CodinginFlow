package com.example.codinginflow.Interface;

import android.util.Log;

import javax.inject.Inject;

class Diesel implements Engine2 {
    private static final String TAG = "Engine";


    @Inject
    public Diesel() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: Diesel");
    }
}
