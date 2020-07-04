package com.example.codinginflow;

import android.util.Log;

class Remote {
    private static final String TAG = "Engine";


    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG, "setListener: Remote conected");
    }
}
