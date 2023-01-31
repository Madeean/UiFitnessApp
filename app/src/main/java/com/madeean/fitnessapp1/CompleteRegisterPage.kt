package com.madeean.fitnessapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class CompleteRegisterPage : AppCompatActivity() {
    private lateinit var gender:AutoCompleteTextView
    var dd1 = arrayOf<String>()
    var genderIn:String = ""

    private lateinit var btn_next: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_register_page)

        gender = findViewById(R.id.acGender)

        dd1 = resources.getStringArray(R.array.gender)

        var adapter1 : ArrayAdapter<String> = ArrayAdapter<String>(this, R.layout.dropdown_menu,dd1)
        gender.setAdapter(adapter1)


        btn_next = findViewById(R.id.btn_next_complete)
        btn_next.setOnClickListener{
            val intent = Intent(this,SliderAfterRegisterPage::class.java)
            startActivity(intent)
        }

    }
}