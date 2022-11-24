package com.example.iotmacrochallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.iotmacrochallange.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(), DeviceRecyclerClickListener {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        val data = listOf(
            DeviceViewModel(R.drawable.device_image, "Kurumi", "Status: Standby"),
            DeviceViewModel(R.drawable.device_image2, "Umeda", "Status: Standby")
        )

        val adapter = DeviceListAdapter(data)

        val rvDevice = binding.rvDevice

        //set click listener
        adapter.listener = this

        rvDevice.apply {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(this@HomeActivity)
        }

        binding.btnSetting.setOnClickListener {
            val intent = Intent(this, GeneralSettingActivity::class.java)

            startActivity(intent)
        }



    }

    override fun onItemClicked(view: View, device: DeviceViewModel) {
        val intent = Intent(this, DeviceActivity::class.java)

        startActivity(intent)
    }
}