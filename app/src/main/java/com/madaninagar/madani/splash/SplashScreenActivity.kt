package com.madaninagar.madani.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.madaninagar.madani.databinding.ActivitySplashScreenBinding
import com.madaninagar.madani.home.view.activity.HomeActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({ //This method will be executed once the timer is over
            // Start your app main activity
            val i = Intent(this@SplashScreenActivity, HomeActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 3000)
    }
}