package com.madaninagar.madani.contact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.madaninagar.madani.R
import com.madaninagar.madani.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityContactBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()
        initListeners()
    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.contact)
    }

    private fun initListeners() {
        binding.toolbar.ivToolbarBack.setOnClickListener { finish() }
    }
}