package com.madaninagar.madani.madani_committee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.madaninagar.madani.databinding.ActivityMadaniCommitteeBinding

class MadaniCommitteeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMadaniCommitteeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMadaniCommitteeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}