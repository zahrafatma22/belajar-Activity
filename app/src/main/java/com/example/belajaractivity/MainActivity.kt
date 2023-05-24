package com.example.belajaractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.belajaractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btKirim.setOnClickListener {
            sendMessage()
        }
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        Log.d("lifecycle", "onCreate Dimulai")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle","OnStart dimulai")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle","OnResume dimulai")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle","OnPause dimulai")
    }

    override fun onRestart() {
        super.onRestart()
        binding.inputNama.setText("")
        Log.d("lifecycle","OnRestart dimulai")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle","OnStop dimulai")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle","OnDestory dimulai")
    }

    fun sendMessage(){
        val nama2 = binding.inputNama.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("nama",nama2)
        startActivity(intent)
    }
}