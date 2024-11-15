package com.example.fixer

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fixer.databinding.ActivityCustomerBinding

class CustomerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activityButton.setOnClickListener {
            startActivity(Intent(baseContext, ListServicesActivity::class.java))
        }
        binding.profileButton.setOnClickListener {
            startActivity(Intent(baseContext, ProfileCustomerActivity::class.java))
        }
        binding.fontaneriaButton.setOnClickListener {
            startActivity(Intent(baseContext, CurrentServiceActivity::class.java))
        }





    }
}