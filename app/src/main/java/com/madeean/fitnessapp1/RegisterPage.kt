package com.madeean.fitnessapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterPage : AppCompatActivity() {
    private lateinit var btn_login:TextView
    private lateinit var btn_register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        btn_login = findViewById(R.id.tv_login)
        btn_register = findViewById(R.id.btn_register)

        btn_login.setOnClickListener {
            startActivity(Intent(this,LoginPage::class.java))
            finish()
        }

        btn_register.setOnClickListener {
            startActivity(Intent(this,CompleteRegisterPage::class.java))
            finish()
        }

    }
}