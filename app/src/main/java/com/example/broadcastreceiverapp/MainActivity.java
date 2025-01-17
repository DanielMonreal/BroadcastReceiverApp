package com.example.broadcastreceiverapp;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter("com.codingpursuits.myBroadcastMessage");
        MyBroadcastReceiver objReceiver = new MyBroadcastReceiver();
        registerReceiver(objReceiver,intentFilter);
    }
}