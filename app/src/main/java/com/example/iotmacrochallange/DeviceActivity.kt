package com.example.iotmacrochallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iotmacrochallange.databinding.ActivityDeviceBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class DeviceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDeviceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDeviceBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSetting.setOnClickListener {
            val intent = Intent(this, DeviceSettingActivity::class.java)

            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnMap.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)

            startActivity(intent)
        }

        binding.btnRemote.setOnClickListener {
            val intent = Intent(this, RemoteActivity::class.java)

            startActivity(intent)
        }

        binding.btnPlan.setOnClickListener {
            val intent = Intent(this, PlanActivity::class.java)

            startActivity(intent)
        }

        binding.btnUsage.setOnClickListener {
            val intent = Intent(this, UsageActivity::class.java)

            startActivity(intent)
        }

        binding.btnSchedule.setOnClickListener {
            val intent = Intent(this, ScheduleActivity::class.java)

            startActivity(intent)
        }

        binding.btnSpeed.setOnClickListener {
            var fanSpeedFragment = FanSpeedFragment()
            fanSpeedFragment.show(supportFragmentManager, "TAG")
        }

        binding.btnWater.setOnClickListener {
            var waterLevelFragment = WaterLevelFragment()
            waterLevelFragment.show(supportFragmentManager, "TAG")
        }
    }
}