package com.madeean.fitnessapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn_get_started: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_get_started = findViewById(R.id.btn_get_started)

        btn_get_started.setOnClickListener {
            startActivity(Intent(this,SliderPage::class.java))
            finish()
        }

    }
}