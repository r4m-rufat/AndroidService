package com.codingwithrufat.androidservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var buttonStart: Button
    private lateinit var buttonStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStart = findViewById(R.id.startServiceButton)
        buttonStop = findViewById(R.id.stopServiceButton)
        buttonStart.setOnClickListener(this)
        buttonStop.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            buttonStart -> startService(Intent(this, MediaPlayerService::class.java))
            buttonStop -> stopService(Intent(this, MediaPlayerService::class.java))
        }
    }
}