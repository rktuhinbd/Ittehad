package com.madaninagar.madani.home.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.asatijaye_keram.view.AsatijayeKeramActivity
import com.madaninagar.madani.collect_information.CollectInformationActivity
import com.madaninagar.madani.databinding.ActivityHomeBinding
import com.madaninagar.madani.home.model.Data
import com.madaninagar.madani.home.view.adapter.RecyclerAdapter
import com.madaninagar.madani.shura_committee.view.activity.ShuraCommitteeActivity
import com.madaninagar.madani.publication.view.PublicationActivity
import com.madaninagar.madani.fujala_wa_abna.view.FujalaWaAbnaActivity
import com.madaninagar.madani.sonwari_jimmadar.view.activity.SonwariJimmadarActivity

class HomeActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityHomeBinding
    private lateinit var recyclerAdapter: RecyclerAdapter

    // = = = = = Declare Data Properties = = = = = //

    private lateinit var dataList: List<Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()

    }

    private fun initComponents() {
        dataList = generateDummyList()

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
                    startActivity(Intent(this@HomeActivity, SonwariJimmadarActivity::class.java))
                }
                3 -> {
                    startActivity(Intent(this@HomeActivity, FujalaWaAbnaActivity::class.java))
                }
                4 -> {
                    startActivity(Intent(this@HomeActivity, ShuraCommitteeActivity::class.java))
                }
                5 -> {
                    startActivity(Intent(this@HomeActivity, CollectInformationActivity::class.java))
                }
                6 -> {
                    startActivity(Intent(this@HomeActivity, PublicationActivity::class.java))
                }
                7 -> {
                    startActivity(Intent(this@HomeActivity, PublicationActivity::class.java))
                }
                8 -> {
                    startActivity(Intent(this@HomeActivity, PublicationActivity::class.java))
                }
            }
        }
    }

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList += Data(1, getString(R.string.asatijaye_keram), R.drawable.ic_king_crown)
        dataList += Data(2, getString(R.string.sonwari_jimmadar), R.drawable.ic_king_crown)
        dataList += Data(3, getString(R.string.fujala_wa_abna), R.drawable.ic_king_crown)
        dataList += Data(4, getString(R.string.shura_and_committee), R.drawable.ic_king_crown)
        dataList += Data(5, getString(R.string.collect_information), R.drawable.ic_king_crown)
        dataList += Data(6, getString(R.string.elan), R.drawable.ic_king_crown)
        dataList += Data(7, getString(R.string.publication), R.drawable.ic_king_crown)
        dataList += Data(8, getString(R.string.contact), R.drawable.ic_king_crown)

        return dataList
    }
}