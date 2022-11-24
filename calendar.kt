package com.example.macrodoraemon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class calendar : AppCompatActivity(), View.OnClickListener {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_calendar)
        val btnMoveActivity: ImageButton = findViewById (R.id.tombackDate)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tombackDate -> {
                val moveIntent = Intent(this@calendar, ScheduleHari::class.java)
                startActivity(moveIntent)
            }
        }
    }
}