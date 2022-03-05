package com.madaninagar.madani.asatijaye_keram.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.asatijaye_keram.model.Data
import com.madaninagar.madani.data_store.DataStore
import com.madaninagar.madani.databinding.ActivityAsatijayeKeramBinding

class AsatijayeKeramActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityAsatijayeKeramBinding
    private lateinit var recyclerAdapter: RecyclerAdapter

    // = = = = = Declare Data Properties = = = = = //

    private lateinit var dataList: List<Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsatijayeKeramBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initComponents()
        initListeners()

    }

    private fun initData() {
        dataList = ArrayList()

        for (i in 0..77) {
            dataList += Data(
                DataStore.ostadGonNameList[i],
                DataStore.ostadContactList[i]
            )
        }
    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.asatijaye_keram)

        binding.rvTest.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter = RecyclerAdapter(this, dataList)
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