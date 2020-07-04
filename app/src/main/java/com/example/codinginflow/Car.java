package com.example.codinginflow;

import android.util.Log;

import com.example.codinginflow.library.Wheels;

import javax.inject.Inject;

class Car {
    private static final String TAG = "Engine";

    @Inject Engine engine;
    Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    void drive(){
        Log.d(TAG, "drivinggggggggggg");
        engine.endgineSound();
    }

    @Inject
    void vasea(){
        Log.d(TAG, "vasea:  yo yo yo" );
        enableRemore(new Remote());
    }

    public void enableRemore(Remote remote){
        remote.setListener(this);
    }


//    @Inject
//    public void enableRemore(Remote remote){
//        remote.setListener(this);
//    }
}
