package com.example.prak_2_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val km: EditText = findViewById(R.id.km)
        val m: EditText = findViewById(R.id.m)
        val dm: EditText = findViewById(R.id.dm)
        val sm: EditText = findViewById(R.id.sm)
        val mm: EditText = findViewById(R.id.mm)
        var rez: TextView = findViewById(R.id.rezult)
        val button: Button = findViewById(R.id.inspect)
        val rezImage: ImageView = findViewById(R.id.answer)

        button.setOnClickListener {
            val kmString = km.text.toString().toFloat()
            val mString = m.text.toString().toFloat()
            val dmString = dm.text.toString().toFloat()
            val smString = sm.text.toString().toFloat()
            val mmString = mm.text.toString().toFloat()
            if (kmString == mString / 1000 && mmString == mString * 1000 && smString == mString * 100 && dmString == mString * 10) {
                rez.text = "Отлично!"
                rez.setTextColor(resources.getColor(R.color.blue))
                rezImage.setImageResource(R.drawable.cool)
            } else {
                rez.text = "Повторите материал, ответ неверный!"
                rez.setTextColor(resources.getColor(R.color.red))
                rezImage.setImageResource(R.drawable.bad)
            }
        }
    }
}