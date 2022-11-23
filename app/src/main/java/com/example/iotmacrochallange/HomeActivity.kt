package com.example.iotmacrochallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.iotmacrochallange.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val rvDevice = binding.rvDevice

        rvDevice.layoutManager = LinearLayoutManager(this)

        //data dummy
        val data = ArrayList<DeviceViewModel>()
        data.add(DeviceViewModel(R.drawable.device_image, "Kurumi", "Status: Cleaning"))
        data.add(DeviceViewModel(R.drawable.device_image2, "Umeda", "Status: Standby"))

        val adapter = DeviceListAdapter(data)

        rvDevice.adapter = adapter

        binding.btnSetting.setOnClickListener {
            val intent = Intent(this, GeneralSettingActivity::class.java)

            startActivity(intent)
        }

    }
}