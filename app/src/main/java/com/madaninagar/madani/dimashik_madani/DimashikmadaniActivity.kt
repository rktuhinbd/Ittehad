package com.madaninagar.madani.dimashik_madani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.databinding.ActivityDimashikmadaniBinding
import com.madaninagar.madani.dimashik_madani.model.Data
import com.madaninagar.madani.dimashik_madani.model.RecyclerAdapter

class DimashikmadaniActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDimashikmadaniBinding
    private lateinit var recyclerAdapter: RecyclerAdapter
    private lateinit var dataList: List<Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDimashikmadaniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()

    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.asatijaye_keram)

        dataList = generateDummyList()

        binding.rvBooks.layoutManager = GridLayoutManager(this, 3)
        recyclerAdapter = RecyclerAdapter(this, dataList)
        binding.rvBooks.adapter = recyclerAdapter

        recyclerAdapter.onItemClick = {

        }
    }

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList += Data(1, "2000", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(2, "2001", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(3, "2002", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(4, "2003", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(5, "2004", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(6, "2005", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(7, "2006", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(8, "2007", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(9, "2008", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(10, "2009", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(11, "2010", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(12, "2011", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(13, "2012", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(14, "2013", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(15, "2014", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(16, "2015", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(17, "2016", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(18, "2017", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(19, "2018", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(20, "2019", "নভেম্বর-ডিসেম্বর", "")
        dataList += Data(21, "2020", "নভেম্বর-ডিসেম্বর", "")

        return dataList
    }
}