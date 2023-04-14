package com.infotechworld.servicedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class DiagnosisFeature : AppCompatActivity() {

    lateinit var listv:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnosis_feature)
        listv = findViewById(R.id.listview)

        val list = listOf("aa", "bb", "cc", "dd", "ee")
        val listInt = listOf(1, 2, 3)

        val n = listInt.filter { it % 2 == 0 }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)

        listv.adapter   = adapter
    }
}