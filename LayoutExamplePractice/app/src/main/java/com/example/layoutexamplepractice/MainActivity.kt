package com.example.layoutexamplepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        var linearLayout: LinearLayout = LinearLayout(this)
        var param = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        linearLayout.layoutParams = param
        linearLayout.orientation = LinearLayout.VERTICAL

        setContentView(linearLayout)
    }
}