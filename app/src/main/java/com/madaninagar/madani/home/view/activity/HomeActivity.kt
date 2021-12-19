package com.madaninagar.madani.home.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.databinding.ActivityHomeBinding
import com.madaninagar.madani.home.model.Data
import com.madaninagar.madani.home.view.adapter.RecyclerAdapter

class HomeActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding : ActivityHomeBinding
    private lateinit var recyclerAdapter: RecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList: List<Data> = generateDummyList()

        binding.rvHome.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter = RecyclerAdapter(dataList)
        binding.rvHome.adapter = recyclerAdapter

        recyclerAdapter.onItemClick = {
            // Todo Open Activities according to recycler item selection

        }
    }

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList += Data(1, "Asatijaye Keram", R.drawable.ic_king_crown)
        dataList += Data(2, "Abnaye Rahmania", R.drawable.ic_king_crown)
        dataList += Data(3, "Madani Committee", R.drawable.ic_king_crown)
        dataList += Data(4, "Jamat Protinidhee", R.drawable.ic_king_crown)
        dataList += Data(5, "Update Information", R.drawable.ic_king_crown)
        dataList += Data(6, "Di-Mashik Madani", R.drawable.ic_king_crown)

        return dataList
    }
}