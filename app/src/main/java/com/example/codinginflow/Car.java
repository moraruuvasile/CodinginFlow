package com.example.codinginflow;

import android.util.Log;

import javax.inject.Inject;

class Car {
    private static final String TAG = "Car";

    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    void drive(){
        Log.d(TAG, "drivinggggggggggg");
    }
}
