package com.infotechworld.servicedemo

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.work.Worker
import androidx.work.WorkerParameters


class MyService(appContext: Context, param: WorkerParameters) : Worker(appContext, param) {
    var context: Context
    init {
        this.context = appContext
    }

    override fun doWork(): Result {
        try {
            var count = inputData.getInt("c", 0)
            for(i in 1..count){
                Log.i("MYTAG", "Uploading $i")
                val handler = Handler(Looper.getMainLooper())
                handler.postDelayed(Runnable { // Run your task here
                    Toast.makeText(context, "$i", Toast.LENGTH_SHORT).show()
                }, 0)
                Thread.sleep(1500)
            }

            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }
    }
}