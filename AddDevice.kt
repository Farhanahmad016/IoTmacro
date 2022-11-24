package com.example.macrodoraemon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AddDevice : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_adddevice)
        val btnMoveActivity: ImageButton = findViewById (R.id.tomsettings)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveActivitykotakbulet: ImageButton = findViewById (R.id.kotakbulet)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tomsettings -> {
                val moveIntent = Intent(this@AddDevice,::class.java)//kurang tujuan classs
                startActivity(moveIntent)
            }
        }
        when (v.id) {
            R.id.kotakbulet -> {
                val moveIntent = Intent(this@AddDevice,::class.java //kurang tujuan classs
                startActivity(moveIntent)
            }
        }
    }
}