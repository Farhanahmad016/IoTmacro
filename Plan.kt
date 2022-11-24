package com.example.macrodoraemon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Plan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_plan)
        val btnMoveActivity: ImageButton = findViewById (R.id.tombackPlan)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tombackPlan -> {
                val moveIntent = Intent(this@Plan, ::class.java)//kurang tujuan classs
                startActivity(moveIntent)
            }
        }
    }
}