package com.example.iotmacrochallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.iotmacrochallange.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_map)

        val map = listOf(
            MapViewModel("Bedroom 1", "Total 32 m²"),
            MapViewModel("Living Room", "Total 72 m²"),
            MapViewModel("Kitchen", "Total 50 m²"),
            MapViewModel("Middle Room", "Total 72 m²"),
            MapViewModel("Bedroom 2", "Total 40 m²"),
            MapViewModel("Bedroom 3", "Total 36 m²"),
            MapViewModel("Bedroom 4", "Total 50 m²"),
        )

        val adapter = MapListAdapter(map)

        val rvMap = binding.rvMap

        rvMap.apply {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(this@MapActivity)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}