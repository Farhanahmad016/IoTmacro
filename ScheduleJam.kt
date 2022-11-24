package com.example.macrodoraemon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

    class ScheduleJam : AppCompatActivity(), View.OnClickListener {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_schedulejam)
            val btnMoveActivity: ImageButton = findViewById(R.id.iconBackSchedule)
            btnMoveActivity.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            when (v.id) {
                R.id.iconBack -> {
                    val moveIntent = Intent(this@ScheduleJam, Schedule ::class.java)
                    startActivity(moveIntent)
                }
            }
        }
}