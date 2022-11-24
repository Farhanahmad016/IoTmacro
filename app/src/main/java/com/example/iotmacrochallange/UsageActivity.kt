package com.example.iotmacrochallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.iotmacrochallange.databinding.ActivityMapBinding
import com.example.iotmacrochallange.databinding.ActivityUsageBinding

class UsageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUsageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_usage)

        val usage = listOf(
            UsageViewModel(R.drawable.usage1, "70%", "Fill the bag", "Fix about 2 hours"),
            UsageViewModel(R.drawable.usage2, "80%", "Fill the bag", "Fix about 1 hours"),
            UsageViewModel(R.drawable.usage3, "85%", "Fill the bag", "Fix about 2 hours"),
            UsageViewModel(R.drawable.usage4, "85%", "Fill the bag", "Fix about 5 hours"),
            UsageViewModel(R.drawable.usage5, "85%", "Fill the bag", "Fix about 3 hours"),
        )

        val adapter = UsageListAdapter(usage)

        val rvUsage = binding.rvUsage

        rvUsage.apply {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(this@UsageActivity)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}