package com.example.talenthub8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talenthub8.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnGetstartedListener()
    }

    private fun btnGetstartedListener() {
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, AwalActivity::class.java))
        }
    }
}