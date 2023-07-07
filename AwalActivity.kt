package com.example.talenthub8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talenthub8.databinding.ActivityAwalBinding


class AwalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAwalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAwalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnGetstartedListener()
    }

    private fun btnGetstartedListener() {
        binding.btn2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}