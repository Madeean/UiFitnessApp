package com.madeean.fitnessapp1

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager

class SliderPage : AppCompatActivity() {

    private lateinit var myAdapterViewPager:MyAdapterViewPager
    private lateinit var layouts:IntArray
    private lateinit var button_slider:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider_page)
        button_slider = findViewById(R.id.button_slider)

        val viewPager:ViewPager = findViewById(R.id.viewPager)


        statusBarTransparent()

        button_slider.setOnClickListener {
            val currentPage:Int = viewPager.currentItem +1

            if(currentPage < layouts.size){
                viewPager.currentItem = currentPage
            }
            else{
                startActivity(Intent(this,RegisterPage::class.java))
                finish()
            }
        }

        layouts = intArrayOf(R.layout.slide_1,R.layout.slide_2,R.layout.slide_3,R.layout.slide_4)
        myAdapterViewPager = MyAdapterViewPager(layouts,applicationContext)
        viewPager.adapter = myAdapterViewPager
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                 if(position == layouts.size - 1){
                    button_slider.setImageDrawable(resources.getDrawable(R.drawable.button_improve_sleep))
                 }else if(position == layouts.size - 2){
                     button_slider.setImageDrawable(resources.getDrawable(R.drawable.btn_eat_well))
                 }else if(position == layouts.size - 3) {
                     button_slider.setImageDrawable(resources.getDrawable(R.drawable.btn_get_burn))
                 }else{
                        button_slider.setImageDrawable(resources.getDrawable(R.drawable.btn_track_your_goal))
                 }

            }

        })

    }

    private fun statusBarTransparent() {
        if(Build.VERSION.SDK_INT >= 21){
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }
    }
}