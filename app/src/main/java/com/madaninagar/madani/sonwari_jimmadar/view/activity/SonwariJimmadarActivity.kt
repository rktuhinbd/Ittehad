package com.madaninagar.madani.sonwari_jimmadar.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.data_store.DataStore
import com.madaninagar.madani.sonwari_jimmadar.view.adapter.RecyclerAdapter
import com.madaninagar.madani.databinding.ActivitySonwariJimmadarBinding
import com.madaninagar.madani.fujala_wa_abna.model.Data

class SonwariJimmadarActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivitySonwariJimmadarBinding
    private lateinit var recyclerAdapter: RecyclerAdapter


    // = = = = = Declare Data Properties = = = = = //

    private lateinit var yearList: List<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonwariJimmadarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initComponents()
    }

    private fun initData() {
        yearList = ArrayList()

        for (i in 0 until DataStore.years.size) {
            yearList += DataStore.years[i]
        }
    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.sonwari_jimmadar)
        binding.toolbar.ivToolbarBack.setOnClickListener { finish() }

        binding.rvTest.layoutManager = GridLayoutManager(this, 2)
        recyclerAdapter = RecyclerAdapter(this, yearList)
        binding.rvTest.adapter = recyclerAdapter

        recyclerAdapter.onItemClick = {
            val intent =
                Intent(this@SonwariJimmadarActivity, SonwariJimmadarYearActivity::class.java)
            intent.putExtra("year", it)
            startActivity(intent)
        }
    }
}