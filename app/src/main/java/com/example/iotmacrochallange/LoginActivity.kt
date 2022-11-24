package com.example.iotmacrochallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iotmacrochallange.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)

            startActivity(intent)
        }

        binding.btnSkip.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)
            finish()
        }

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        binding.btnGoogle.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        binding.btnFacebook.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}