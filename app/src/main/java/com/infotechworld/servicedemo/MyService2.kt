package com.infotechworld.servicedemo

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyService2: IntentService("My_Service") {
    override fun onHandleIntent(intent: Intent?) {
        try {
            val count = intent?.getIntExtra("c",0)
            for(i in 1..count!!){
                Log.i("MYTAG2", "Uploading $i")
                Thread.sleep(2000)
            }
        } catch (e: Exception){

        }
    }
}