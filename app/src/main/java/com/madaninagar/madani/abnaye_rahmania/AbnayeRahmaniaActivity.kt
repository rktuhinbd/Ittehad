package com.madaninagar.madani.abnaye_rahmania

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.madaninagar.madani.databinding.ActivityAbnayeRahmaniaBinding

class AbnayeRahmaniaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAbnayeRahmaniaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAbnayeRahmaniaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}