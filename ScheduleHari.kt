package com.example.macrodoraemon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ScheduleHari : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_schedulehari)
        val btnMoveActivity: ImageButton = findViewById (R.id.tombolBack)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tombolBack -> {
                val moveIntent = Intent(this@ScheduleHari, ScheduleJam::class.java)
                startActivity(moveIntent)
            }
        }
    }
}