package com.madaninagar.madani.collect_information

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.madaninagar.madani.R
import com.madaninagar.madani.databinding.ActivityCollectInformationBinding

class CollectInformationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCollectInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCollectInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()
        initListeners()

    }


    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.collect_information)
    }


    private fun initListeners() {
        binding.toolbar.ivToolbarBack.setOnClickListener { finish() }
    }
}