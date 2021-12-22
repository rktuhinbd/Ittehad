package com.madaninagar.madani.home.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.abnaye_rahmania.view.AbnayeRahmaniaActivity
import com.madaninagar.madani.asatijaye_keram.view.AsatijayeKeramActivity
import com.madaninagar.madani.databinding.ActivityHomeBinding
import com.madaninagar.madani.dimashik_madani.DimashikmadaniActivity
import com.madaninagar.madani.home.model.Data
import com.madaninagar.madani.home.view.adapter.RecyclerAdapter
import com.madaninagar.madani.jamat_protinidhee.JamatProtinidheeActivity
import com.madaninagar.madani.madani_committee.MadaniCommitteeActivity
import com.madaninagar.madani.update_information.UpdateInformationActivity

class HomeActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityHomeBinding
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
            when (it.id) {
                1 -> {
                    startActivity(Intent(this@HomeActivity, AsatijayeKeramActivity::class.java))
                }
                2 -> {
                    startActivity(Intent(this@HomeActivity, AbnayeRahmaniaActivity::class.java))
                }
                3 -> {
                    startActivity(Intent(this@HomeActivity, MadaniCommitteeActivity::class.java))
                }
                4 -> {
                    startActivity(Intent(this@HomeActivity, JamatProtinidheeActivity::class.java))
                }
                5 -> {
                    startActivity(Intent(this@HomeActivity, UpdateInformationActivity::class.java))
                }
                6 -> {
                    startActivity(Intent(this@HomeActivity, DimashikmadaniActivity::class.java))
                }
            }
        }
    }

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList += Data(1, getString(R.string.asatijaye_keram), R.drawable.ic_king_crown)
        dataList += Data(2, getString(R.string.abnaye_rahmania), R.drawable.ic_king_crown)
        dataList += Data(3, getString(R.string.madani_committee), R.drawable.ic_king_crown)
        dataList += Data(4, getString(R.string.jamat_protinidhee), R.drawable.ic_king_crown)
        dataList += Data(5, getString(R.string.update_information), R.drawable.ic_king_crown)
        dataList += Data(6, getString(R.string.di_mashik_madani), R.drawable.ic_king_crown)

        return dataList
    }
}