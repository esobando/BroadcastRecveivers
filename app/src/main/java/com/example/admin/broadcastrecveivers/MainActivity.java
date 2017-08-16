package com.example.admin.broadcastrecveivers;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    MyDynamicReceiver myDynamicReceiver = new MyDynamicReceiver();
    IntentFilter intentFilter;
    int NumberG;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcasts(View view) {

        switch(view.getId()){
            case R.id.btnStaticBroadcast:

                Intent intent = new Intent();

                intent.setAction("myAction");
                sendBroadcast(intent);

                break;
            case R.id.btnStaticBroadcast2:

                Intent intent1 = new Intent();

                intent1.setAction("myAction2");
                sendBroadcast(intent1);

                break;

            case R.id.btnDynamicBroadcast:

                Intent intent2 = new Intent();

                intent2.setAction("doSomething");
                sendBroadcast(intent2);

                break;
//            case R.id.btnRandom:
//                Intent intent3 = new Intent(this, SecondActivity.class);
//                intent3.putExtra("KEY", " " + NumberG);
//                startActivity(intent3);
//                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        intentFilter = new IntentFilter();
        intentFilter.addAction("doSomething");

        registerReceiver(myDynamicReceiver, intentFilter);

    }


    @Override
    protected void onStop() {
        super.onStop();

        unregisterReceiver(myDynamicReceiver);
    }
}
