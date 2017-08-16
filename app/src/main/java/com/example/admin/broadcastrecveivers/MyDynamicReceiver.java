package com.example.admin.broadcastrecveivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Admin on 8/15/2017.
 */

public class MyDynamicReceiver extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context, "I am dynamic", Toast.LENGTH_SHORT).show();
    }
}
