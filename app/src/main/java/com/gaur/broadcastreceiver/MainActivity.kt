package com.gaur.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    val myBroad = MyBroad()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        val intentFilter = IntentFilter(Intent.ACTION_TIME_TICK)
        registerReceiver(myBroad,intentFilter)

        val intent = Intent(this,MyBroad::class.java)
        sendBroadcast(intent)


    }


    override fun onStop() {
        super.onStop()
        unregisterReceiver(myBroad)

    }


}