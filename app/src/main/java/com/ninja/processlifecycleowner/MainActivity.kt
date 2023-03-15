package com.ninja.processlifecycleowner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ninja.processlifecycleowner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        binding.launchAnotherActivity.setOnClickListener {
            val intent = Intent(applicationContext,AnotherActivity::class.java)
            startActivity(intent)
        }
        setContentView(view)
    }
}