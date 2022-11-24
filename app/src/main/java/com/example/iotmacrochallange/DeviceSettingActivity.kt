package com.example.iotmacrochallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iotmacrochallange.databinding.ActivityDeviceSettingBinding

class DeviceSettingActivity : AppCompatActivity() {

    lateinit var binding: ActivityDeviceSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDeviceSettingBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnDelete.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}