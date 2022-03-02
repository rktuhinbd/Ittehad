package com.madaninagar.madani.asatijaye_keram.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.asatijaye_keram.model.Data
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

        initComponents()
        initListeners()

    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.asatijaye_keram)

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
            "01011001100",
            "তোফাজ্জল হোসেনের বাড়ি",
            "রহিমপুর",
            "মুরাদনগর",
            "মুরাদনগর",
            "কুমিল্লা",
            false
        )
        dataList += Data(
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
        dataList += Data(
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
        dataList += Data(
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
        dataList += Data(
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
        dataList += Data(
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
        dataList += Data(
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
        dataList += Data(
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