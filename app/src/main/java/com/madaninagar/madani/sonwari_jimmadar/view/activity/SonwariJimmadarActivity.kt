package com.madaninagar.madani.sonwari_jimmadar.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.sonwari_jimmadar.model.Data
import com.madaninagar.madani.sonwari_jimmadar.view.adapter.RecyclerAdapter
import com.madaninagar.madani.databinding.ActivitySonwariJimmadarBinding

class SonwariJimmadarActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivitySonwariJimmadarBinding
    private lateinit var recyclerAdapter: RecyclerAdapter


    // = = = = = Declare Data Properties = = = = = //

    private lateinit var dataList: List<Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonwariJimmadarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()
    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.sonwari_jimmadar)
        binding.toolbar.ivToolbarBack.setOnClickListener { finish() }

        dataList = generateDummyList()

        binding.rvTest.layoutManager = GridLayoutManager(this, 2)
        recyclerAdapter = RecyclerAdapter(this, dataList)
        binding.rvTest.adapter = recyclerAdapter

        recyclerAdapter.onItemClick = {
            val intent =
                Intent(this@SonwariJimmadarActivity, SonwariJimmadarYearActivity::class.java)
            intent.putExtra("year", it.year)
            startActivity(intent)
        }
    }

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList += Data(1, "2000")
        dataList += Data(2, "2001")
        dataList += Data(3, "2002")
        dataList += Data(4, "2003")
        dataList += Data(5, "2004")
        dataList += Data(6, "2005")
        dataList += Data(7, "2006")
        dataList += Data(8, "2007")
        dataList += Data(9, "2008")
        dataList += Data(10, "2009")
        dataList += Data(11, "2010")
        dataList += Data(12, "2011")
        dataList += Data(13, "2012")
        dataList += Data(14, "2013")
        dataList += Data(15, "2014")
        dataList += Data(16, "2015")
        dataList += Data(17, "2016")
        dataList += Data(18, "2017")
        dataList += Data(19, "2018")
        dataList += Data(20, "2019")
        dataList += Data(21, "2020")
        dataList += Data(22, "2021")

        return dataList
    }
}