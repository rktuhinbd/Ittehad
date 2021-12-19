package com.madaninagar.madani.jamat_protinidhee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.madaninagar.madani.databinding.ActivityJamatProtinidheeBinding

class JamatProtinidheeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJamatProtinidheeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJamatProtinidheeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}