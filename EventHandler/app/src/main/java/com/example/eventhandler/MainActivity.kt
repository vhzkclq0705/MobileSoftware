package com.example.eventhandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setButtonTapHandler()
    }

    fun setButtonTapHandler() {
        var myButton = super.findViewById<Button>(R.id.myButton)

        myButton.setOnClickListener {
            val s: CharSequence = resources.getText(R.string.hello_msg)
            var textView: TextView = findViewById(R.id.textView)
            textView.text = s
        }
    }

}