package com.madaninagar.madani.jamat_protinidhee.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.databinding.ActivityJamatProtinidheeBinding
import com.madaninagar.madani.jamat_protinidhee.model.Data

class JamatProtinidheeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJamatProtinidheeBinding
    private lateinit var recyclerAdapter: RecyclerAdapter
    private lateinit var dataList: List<Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJamatProtinidheeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
        initComponents()

    }

    private fun initComponents() {

        binding.toolbar.tvToolbarTitle.text = getString(R.string.jamat_protinidhee)

        dataList = generateDummyList()

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

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList += Data(
            1,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )
        dataList += Data(
            2,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )
        dataList += Data(
            3,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )
        dataList += Data(
            4,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )
        dataList += Data(
            5,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )
        dataList += Data(
            6,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )
        dataList += Data(
            7,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )
        dataList += Data(
            8,
            "মোঃ রেজাউল করিম",
            "01841752600",
            "2001"
        )

        return dataList
    }
}