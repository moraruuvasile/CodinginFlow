package com.example.codinginflow;

import android.util.Log;

import javax.inject.Inject;

class Engine {
    private static final String TAG="Engine";

    @Inject
    public Engine() {
        Log.d(TAG, "Engine: brrrrr");
    }
    
    void endgineSound(){
        Log.d(TAG, "endgineSound: Pf pf pfpfpfpfpf");
    }
}
