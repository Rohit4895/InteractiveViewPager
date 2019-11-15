package com.example.interactiveviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CustomViewPagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return FragmentFirst()
            }
            else -> {
                return FragmentSecond()
            }

        }
    }

    override fun getCount(): Int {
        return 2
    }
}