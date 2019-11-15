package com.example.interactiveviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)

        viewPager?.adapter = CustomViewPagerAdapter(supportFragmentManager)

        viewPager?.setPageTransformer(false) {
                page, position ->
            val offset = 1-Math.abs(position)

         /*   page.alpha = offset
            page.scaleX = offset
            page.scaleY = offset
            */

            page.pivotX = (page.width/2f)
            page.pivotY = (page.height/2f)

            page.rotationY = position*90

            Log.d("qwerty","Position: ${Math.abs(position)}")
        }
    }
}
