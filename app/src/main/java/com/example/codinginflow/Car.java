package com.example.codinginflow;

import android.util.Log;

import com.example.codinginflow.Interface.Engine2;
import com.example.codinginflow.library.Wheels;

import javax.inject.Inject;


class Car {
    private static final String TAG = "Engine";

    @Inject Engine engine;
    Wheels wheels;
    Engine2 engine2;

    @Inject
    public Car(Wheels wheels, Engine2 engine2) {
        this.wheels = wheels;
        this.engine2 = engine2;
    }

    void drive(){
        Log.d(TAG, "drivinggggggggggg");
        engine2.start();
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
