package com.example.iotmacrochallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.iotmacrochallange.databinding.ActivityScheduleBinding

class ScheduleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScheduleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_schedule)

        val schedule = listOf(
            ScheduleViewModel("09.00", "Daily"),
            ScheduleViewModel("23.00", "Tue"),
            ScheduleViewModel("11.00", "Weekend"),
            ScheduleViewModel("12.00", "17 Nov 2022"),
        )

        val adapter = ScheduleListAdapter(schedule)

        val rvUsage = binding.rvSchedule

        rvUsage.apply {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(this@ScheduleActivity)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}