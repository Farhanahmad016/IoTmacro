package com.example.iotmacrochallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iotmacrochallange.databinding.GeneralSettingBinding

class GeneralSettingActivity : AppCompatActivity() {

    private lateinit var binding: GeneralSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GeneralSettingBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
            finish()
        }
    }
}