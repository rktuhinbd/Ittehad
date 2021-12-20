package com.madaninagar.madani.asatijaye_keram

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.madaninagar.madani.databinding.ActivityAsatijayeKeramBinding

class AsatijayeKeramActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAsatijayeKeramBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsatijayeKeramBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.ivSearch.setOnClickListener {
            binding.toolbar.layoutTitle.visibility = View.GONE
            binding.toolbar.layoutSearch.visibility = View.VISIBLE
        }

        binding.toolbar.ivCancel.setOnClickListener {
            binding.toolbar.etSearch.text?.clear()
            binding.toolbar.layoutSearch.visibility = View.GONE
            binding.toolbar.layoutTitle.visibility = View.VISIBLE
        }
    }
}