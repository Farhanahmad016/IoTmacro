package com.example.macrodoraemon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DeviceSettings: AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_devicesettings)
        val btnMoveActivity: ImageButton = findViewById (R.id.tombackDeviceSettings)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tombackDeviceSettings -> {
                val moveIntent = Intent(this@DeviceSettings, ScheduleHari::class.java)
                startActivity(moveIntent)
            }
        }
    }
}