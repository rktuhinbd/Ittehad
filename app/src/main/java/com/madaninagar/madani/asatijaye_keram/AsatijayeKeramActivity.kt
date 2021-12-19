package com.madaninagar.madani.asatijaye_keram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.madaninagar.madani.databinding.ActivityAsatijayeKeramBinding

class AsatijayeKeramActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAsatijayeKeramBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsatijayeKeramBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}