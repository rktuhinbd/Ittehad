package com.madaninagar.madani.sonwari_jimmadar.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
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

        getExtras()
        initListeners()
        initComponents()
    }

    private fun getExtras() {
        year = intent.getStringExtra("year")!!
    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = year

        dataList = generateDummyList()

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

    private fun generateDummyList(): ArrayList<YearsData> {
        val dataList = ArrayList<YearsData>()

        dataList += YearsData(
            1,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += YearsData(
            2,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += YearsData(
            3,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += YearsData(
            4,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += YearsData(
            5,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += YearsData(
            6,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += YearsData(
            7,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += YearsData(
            8,
            "মোঃ রেজাউল করিম",
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )

        return dataList
    }

}