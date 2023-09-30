package com.programmingmakesense.sampleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.programmingmakesense.sampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1id.setOnClickListener{ chamarActivity2() }
    }

    private fun chamarActivity2() {
        val context = binding.button1id.context
        val intent = Intent(context, MainActivity2::class.java)
        context.startActivity(intent)
    }
}