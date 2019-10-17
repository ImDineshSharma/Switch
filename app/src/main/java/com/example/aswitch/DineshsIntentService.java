package com.example.aswitch;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class DineshsIntentService extends IntentService {

    public static final String TAG = "com.example.aswitch";

    public DineshsIntentService() {
        super("DineshsIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "The service has now started");
    }
}
