package com.madaninagar.madani.dimashik_madani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.madaninagar.madani.databinding.ActivityDimashikmadaniBinding

class DimashikmadaniActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDimashikmadaniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDimashikmadaniBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}