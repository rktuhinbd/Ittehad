package com.madaninagar.madani.asatijaye_keram

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.asatijaye_keram.model.Data
import com.madaninagar.madani.asatijaye_keram.view.RecyclerAdapter
import com.madaninagar.madani.databinding.ActivityAsatijayeKeramBinding

class AsatijayeKeramActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAsatijayeKeramBinding
    private lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsatijayeKeramBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList: List<Data> = generateDummyList()

        binding.rvTest.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter = RecyclerAdapter(dataList)
        binding.rvTest.adapter = recyclerAdapter

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

        dataList += Data(1, "মোঃ রেজাউল করিম", "01841752600")
        dataList += Data(2, "মোঃ রেজাউল করিম", "01841752600")
        dataList += Data(3, "মোঃ রেজাউল করিম", "01841752600")
        dataList += Data(4, "মোঃ রেজাউল করিম", "01841752600")
        dataList += Data(5, "মোঃ রেজাউল করিম", "01841752600")
        dataList += Data(6, "মোঃ রেজাউল করিম", "01841752600")
        dataList += Data(7, "মোঃ রেজাউল করিম", "01841752600")
        dataList += Data(8, "মোঃ রেজাউল করিম", "01841752600")

        return dataList
    }
}