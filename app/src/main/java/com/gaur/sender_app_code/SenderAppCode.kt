package com.gaur.sender_app_code

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gaur.broadcastreceiver.R


/**


 Create second App and use this code for your sender application in order to follow my code

class MainActivity : AppCompatActivity() {


    private val broad = object: BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            when(intent?.action){
                "com.gaur.broadcastreceiver.ACTION_SEND" ->{
                    val string = intent.getStringExtra("com.gaur.broadcastreceiver.EXTRA_DATA")
                    Toast.makeText(context,"Receiver app receive ${string}", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentFilter = IntentFilter("com.gaur.broadcastreceiver.ACTION_SEND")
        registerReceiver(broad,intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(broad)

    }

}

 **/