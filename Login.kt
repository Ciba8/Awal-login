package com.example.talenthubbatch8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talenthubbatch8.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnGetstartedListener()
    }

    private fun btnGetstartedListener() {
        binding.btn1.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
