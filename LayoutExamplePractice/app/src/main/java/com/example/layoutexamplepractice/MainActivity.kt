package com.example.layoutexamplepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View.generateViewId
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        create_UI()
    }

    // Create UI programmatically
    fun create_UI() {
        // Configure LinearLayout

        var linearLayout: LinearLayout = LinearLayout(this)
        var param = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        linearLayout.layoutParams = param
        linearLayout.orientation = LinearLayout.VERTICAL

        // Configure first button

        var button: Button = Button(this)
        var buttonParam = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        buttonParam.gravity = Gravity.CENTER

        button.id = generateViewId()
        button.text = "첫 번째 버튼"
        button.layoutParams = buttonParam

        // Configure second button

        var button2: Button = Button(this)
        button2.id = generateViewId()
        button2.text = "두 번째 버튼"
        button2.layoutParams = buttonParam

        // Add buttons

        linearLayout.addView(button)
        linearLayout.addView(button2)
        setContentView(linearLayout)
    }

}