package com.gaur.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroad : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        when(intent?.action){
            Intent.ACTION_BOOT_COMPLETED->{
                Toast.makeText(context,"Boot completed",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_TIME_TICK->{
                Toast.makeText(context,"Time changed",Toast.LENGTH_LONG).show()
            }
        }


    }
}