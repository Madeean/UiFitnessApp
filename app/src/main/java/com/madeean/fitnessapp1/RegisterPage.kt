package com.madeean.fitnessapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterPage : AppCompatActivity() {
    private lateinit var btn_login:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        btn_login = findViewById(R.id.tv_login)



    }
}