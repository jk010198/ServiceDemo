package com.infotechworld.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<TextView>(R.id.tvDataService).setOnClickListener{

            val intent = Intent(this, MyService2::class.java)
            intent.putExtra("c", 20)
            startService(intent)
        }
    }
}