package com.madeean.fitnessapp1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.github.islamkhsh.CardSliderAdapter
import com.madeean.fitnessapp1.R
import com.madeean.fitnessapp1.model.SliderRegisterPageModel

class AdapterSliderRegisterPage(private val context: Context, private val listData:ArrayList<SliderRegisterPageModel>) :
PagerAdapter(){
    override fun getCount(): Int {
        if (listData.size > 0) {
            return listData.size
        }
        return 0
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.item_data_slider_register_page, container, false)

        val model = listData[position]
        val image = model.image
        val text_gede = model.text_gede
        val text_kecil = model.text_kecil

        val iv:ImageView = view.findViewById(R.id.iv_item_data_slider_register_page)
        val tv_gede:TextView = view.findViewById(R.id.tv_gede_item_data_slider_register_page)
        val tv_kecil:TextView = view.findViewById(R.id.tv_kecil_item_data_slider_register_page)

        iv.setImageResource(image)
        tv_gede.text = text_gede
        tv_kecil.text = text_kecil

        view.setOnClickListener{
            Toast.makeText(context, "You Clicked ${model.text_gede}", Toast.LENGTH_SHORT).show()
        }

        container.addView(view,position)


        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }


}