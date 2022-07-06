package com.gaur.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// Sender App

class MainActivity : AppCompatActivity() {

    private var button:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button?.setOnClickListener {
            val intent = Intent("com.gaur.broadcastreceiver.ACTION_SEND")
            intent.putExtra("com.gaur.broadcastreceiver.EXTRA_DATA","sender send data")
            sendBroadcast(intent)
        }



    }

}