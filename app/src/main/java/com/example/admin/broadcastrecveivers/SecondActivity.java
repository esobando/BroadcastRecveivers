package com.example.admin.broadcastrecveivers;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    SecondBroadCast broadcastReceiver;
    IntentFilter intentFilter;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tvText);
        broadcastReceiver = new SecondBroadCast(tv);
    }

    @Override
    protected void onStart() {
        super.onStart();

        intentFilter = new IntentFilter();
        intentFilter.addAction("SendText");

        registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        unregisterReceiver(broadcastReceiver);
    }


}