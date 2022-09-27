package com.example.practicelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClicked(v: View) {
        count += 1

        var imageView = findViewById<ImageView>(R.id.imageView)
        var imageView2 = findViewById<ImageView>(R.id.imageView2)
        var imageView3 = findViewById<ImageView>(R.id.imageView3)

        imageView.visibility = View.INVISIBLE
        imageView2.visibility = View.INVISIBLE
        imageView3.visibility = View.INVISIBLE

        when (count % 3) {
            0 -> imageView.visibility = View.VISIBLE
            1 -> imageView2.visibility = View.VISIBLE
            2 -> imageView3.visibility = View.VISIBLE
        }
    }
}