package com.example.convert_dp_to_px

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    val TAG: String = "<<Dimension>>"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActivity()
    }

    fun setActivity() {
        val destiny: Float = resources.displayMetrics.density
        val destinyDpi: Int = resources.displayMetrics.densityDpi

        Log.i(TAG, "destiny = $destiny")
        Log.i(TAG, "destinyDpi = $destinyDpi")

        setButtonTapHandlers(destiny)
    }

    fun setButtonTapHandlers(scale: Float) {
        val dp = 10
        val textView: TextView = findViewById(R.id.textView)

        val button1 = findViewById<Button>(R.id.method1)
        button1.setOnClickListener {
            val px: Int = (dp * scale + 0.5).toInt()
            var s: String = "dp = $dp --> px = $px"
            textView.text = s
        }

        val button2 = findViewById<Button>(R.id.method2)
        button1.setOnClickListener {
            val px: Int = (dp * scale).roundToInt()
            var s: String = "dp = $dp --> px = $px"
            textView.text = s
        }

        val button3 = findViewById<Button>(R.id.method3)
        button1.setOnClickListener {
            val px: Int = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dp.toFloat(),
                resources.displayMetrics).toInt()
            var s: String = "dp = $dp --> px = $px"
            textView.text = s
        }

    }
}