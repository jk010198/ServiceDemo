package com.infotechworld.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.work.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvData).setOnClickListener{
            oneTimeWork()
        }

        findViewById<TextView>(R.id.nxtPage).setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }

        findViewById<TextView>(R.id.button).setOnClickListener{
            //startActivity(Intent(this, DiagnosisFeature::class.java))
        }
    }

    private fun oneTimeWork() {
        val constraint = Constraints.Builder().build()

        val data: Data = Data.Builder()
            .putInt("c",20)
            .build()

        val myWorkRequest: WorkRequest = OneTimeWorkRequest.Builder(MyService::class.java)
            .setConstraints(constraint)
            .setInputData(data)
            .build()

        WorkManager.getInstance(this).enqueue(myWorkRequest)
    }
}