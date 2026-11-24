package com.njm.tool

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(18, 18, 18))

        val title = TextView(this)
        title.text = "NJM TOOL"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "Welcome to NJM Instagram Tool"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER

        layout.addView(subtitle)

        val button = Button(this)
        button.text = "Start"
        layout.addView(button)

        button.setOnClickListener {
            subtitle.text = "NJM Tool is ready!"
        }

        setContentView(layout)
    }
}
