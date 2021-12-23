package com.madaninagar.madani.madani_committee.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.databinding.ActivityMadaniCommitteeBinding
import com.madaninagar.madani.madani_committee.model.CommitteeMemberData
import com.madaninagar.madani.madani_committee.model.Data
import com.madaninagar.madani.madani_committee.view.adapter.RecyclerAdapter

class MadaniCommitteeActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityMadaniCommitteeBinding
    private lateinit var recyclerAdapter: RecyclerAdapter


    // = = = = = Declare Data Properties = = = = = //

    private lateinit var dataList: List<Data>
    private lateinit var dataList2: List<CommitteeMemberData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMadaniCommitteeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()

    }

    private fun initComponents() {
        dataList = generateDummyList()

        binding.rvCommittee.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter = RecyclerAdapter(this, dataList)
        binding.rvCommittee.adapter = recyclerAdapter

        recyclerAdapter.onItemClick = {
            //Todo implementation needed
        }
    }

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList2 = dataList2 + CommitteeMemberData(1, "মোঃ রেজাউল করিম", "01841752600","2010")
        dataList2 = dataList2 + CommitteeMemberData(2, "মোঃ রেজাউল করিম", "01841752600","2011")
        dataList2 = dataList2 + CommitteeMemberData(3, "মোঃ রেজাউল করিম", "01841752600","2012")
        dataList2 = dataList2 + CommitteeMemberData(4, "মোঃ রেজাউল করিম", "01841752600","2013")
        dataList2 = dataList2 + CommitteeMemberData(5, "মোঃ রেজাউল করিম", "01841752600","2014")
        dataList2 = dataList2 + CommitteeMemberData(6, "মোঃ রেজাউল করিম", "01841752600","2015")
        dataList2 = dataList2 + CommitteeMemberData(7, "মোঃ রেজাউল করিম", "01841752600","2016")
        dataList2 = dataList2 + CommitteeMemberData(8, "মোঃ রেজাউল করিম", "01841752600","2017")
        dataList2 = dataList2 + CommitteeMemberData(9, "মোঃ রেজাউল করিম", "01841752600","2018")
        dataList2 = dataList2 + CommitteeMemberData(10, "মোঃ রেজাউল করিম", "01841752600","2019")

        dataList += Data(1, "উপদেষ্টা পর্ষদ", dataList2, false)
        dataList += Data(1, "মজলিশে শূরা", dataList2, false)
        dataList += Data(1, "ফুযালা উচ্চপর্ষদ", dataList2, false)
        dataList += Data(1, "পরিচালনা পর্ষদ", dataList2, false)

        return dataList
    }
}