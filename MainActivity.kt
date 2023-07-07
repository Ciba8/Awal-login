package com.example.talenthubbatch8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talenthubbatch8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnGetstartedListener()
    }

    private fun btnGetstartedListener() {
        binding.btn2.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }
    }
}
