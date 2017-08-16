package com.example.admin.broadcastrecveivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyStaticReceiver extends BroadcastReceiver {

    private static final String TAG ="MyReceiver";
    @Override
    public void onReceive(Context context, Intent intent)
    {
        switch (intent.getAction()){
            case "myAction":
                Log.d(TAG, "onReceiver: " + "myAction");
                break;
            case "myAction2":
                Log.d(TAG, "onReceiver: " + "myAction2");
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Log.d(TAG, "onReceiver: " +  "AirplaneMode");
                break;
            case "Dynamic":
                Log.d(TAG, "onReceiver: " + "Dynamic");
                break;
        }
        Log.d(TAG,"onReceiver");
        Toast.makeText(context, "onReceiver", Toast.LENGTH_SHORT).show();
    }
}
