package com.example.belajaractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajaractivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main2)
        val name = intent.getStringExtra("nama")
        binding.tvHasil.text = name.toString()
        setContentView(binding.root)
    }
}