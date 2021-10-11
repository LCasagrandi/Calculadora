package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MainActivity.inflate(layoutInflater)

        binding.title.text = "Hello"
        binding.subtext.text = "Concise, safe code"
        binding.button.setOnClickListener { /* ... */ }

        setContentView(binding.root)
    }