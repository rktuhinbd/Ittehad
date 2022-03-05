package com.madaninagar.madani.sonwari_jimmadar.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.data_store.DataStore
import com.madaninagar.madani.databinding.ActivitySonwariJimmadarYearBinding
import com.madaninagar.madani.sonwari_jimmadar.model.YearsData
import com.madaninagar.madani.sonwari_jimmadar.view.adapter.YearsRecyclerAdapter

class SonwariJimmadarYearActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivitySonwariJimmadarYearBinding
    private lateinit var recyclerAdapter: YearsRecyclerAdapter


    // = = = = = Declare Data Properties = = = = = //

    private lateinit var dataList: List<YearsData>
    private var year: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonwariJimmadarYearBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        getExtras()
        initListeners()
        initComponents()
    }

    private fun getExtras() {
        year = intent.getStringExtra("year")!!
    }

    private fun initData() {
        dataList = ArrayList()
        for (i in 0..500) {
            dataList += YearsData(
                DataStore.studentNames[i],
                DataStore.studentContactList[i],
                DataStore.villageCurrent[i],
                DataStore.villageOriginal[i],
                DataStore.postCurrent[i],
                DataStore.thanaCurrent[i],
                DataStore.zilaCurrent[i],
                false
            )
        }
    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = year

        binding.rvTest.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter = YearsRecyclerAdapter(this, dataList)
        binding.rvTest.adapter = recyclerAdapter
    }

    private fun initListeners() {

        binding.toolbar.ivToolbarBack.setOnClickListener { finish() }

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
