package com.madaninagar.madani.fujala_wa_abna.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.data_store.DataStore.phoneNumber
import com.madaninagar.madani.data_store.DataStore.studentNames
import com.madaninagar.madani.data_store.DataStore.years
import com.madaninagar.madani.databinding.ActivityFujalaWaAbnaBinding
import com.madaninagar.madani.fujala_wa_abna.model.Data

class FujalaWaAbnaActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityFujalaWaAbnaBinding
    private lateinit var recyclerAdapter: RecyclerAdapter

    // = = = = = Declare Data Properties = = = = = //

    private lateinit var dataList: List<Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFujalaWaAbnaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initListeners()
        initComponents()

    }

    private fun initData() {

        dataList = ArrayList()

        for (i in 0..514) {
            dataList += Data(
                studentNames[i],
                phoneNumber[i],
                years[i]
            )
        }
    }

    private fun initComponents() {

        binding.toolbar.tvToolbarTitle.text = getString(R.string.fujala_wa_abna)
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
