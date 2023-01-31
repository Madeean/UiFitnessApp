package com.madeean.fitnessapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.github.islamkhsh.CardSliderViewPager
import com.madeean.fitnessapp1.adapter.AdapterSliderRegisterPage
import com.madeean.fitnessapp1.model.SliderRegisterPageModel

class SliderAfterRegisterPage : AppCompatActivity() {

     private lateinit var myModelList: ArrayList<SliderRegisterPageModel>
     private lateinit var myAdapter: AdapterSliderRegisterPage

     private lateinit var vp_slider_register_page:ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider_after_register_page)

        vp_slider_register_page = findViewById(R.id.vp_slider_register_page)

        myModelList = ArrayList<SliderRegisterPageModel>().apply {
            add(SliderRegisterPageModel(R.drawable.improve_shape,"Improve Shape","I have a low amount of body fat\nand need / want to build more\nmuscle"))
            add(SliderRegisterPageModel(R.drawable.lean_and_tone,"Lean & Tone","I’m “skinny fat”. look thin but have\nno shape. I want to add learn\nmuscle in the right way"))
            add(SliderRegisterPageModel(R.drawable.lose_a_fat,"Lose a Fat","I have over 20 lbs to lose. I want to\ndrop all this fat and gain muscle\nmass"))
        }
//        findViewById<CardSliderViewPager>(R.id.slider_regis_page).adapter = AdapterSliderRegisterPage(slide)

        loadCards()
        vp_slider_register_page.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                Toast.makeText(this@SliderAfterRegisterPage, "You Clicked ${myModelList[position].text_gede}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun loadCards() {
        myModelList = ArrayList<SliderRegisterPageModel>().apply {
            add(SliderRegisterPageModel(R.drawable.improve_shape,"Improve Shape","I have a low amount of body fat\nand need / want to build more\nmuscle"))
            add(SliderRegisterPageModel(R.drawable.lean_and_tone,"Lean & Tone","I’m “skinny fat”. look thin but have\nno shape. I want to add learn\nmuscle in the right way"))
            add(SliderRegisterPageModel(R.drawable.lose_a_fat,"Lose a Fat","I have over 20 lbs to\nlose. I want to drop all this fat and gain muscle\nmass"))
        }
        myAdapter = AdapterSliderRegisterPage(this, myModelList)

        vp_slider_register_page.adapter = myAdapter
        vp_slider_register_page.setPadding(100,0,100,0)
    }
}