package com.example.aswitch;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public static final String TAG = "com.example.aswitch";

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "OnStartCommand method called");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    try {
                        wait(5000);
                        Log.i(TAG, "The service is doing something");
                    }catch(Exception e){}
                }
            }
        };
        Thread myThread = new Thread(r);
        myThread.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "OnDestroy method called");
    }
}
