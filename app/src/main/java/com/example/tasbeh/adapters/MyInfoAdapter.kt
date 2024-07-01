package com.example.tasbeh.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.tasbeh.databinding.ItemPagerBinding
import com.example.tasbeh.models.My_kalima

class MyInfoAdapter (var list:ArrayList<My_kalima>) : PagerAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        var view = `object` as View
        container.removeView(view)

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemPagerBinding = ItemPagerBinding.inflate(LayoutInflater.from(container.context), container, false)

        itemPagerBinding.txtPagerSal.text = list[position].Name
        container.addView(itemPagerBinding.root)
        return itemPagerBinding.root

    }
}