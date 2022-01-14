package com.madaninagar.madani.shura_committee.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.databinding.ActivityShuraCommitteeBinding
import com.madaninagar.madani.shura_committee.model.CommitteeMemberData
import com.madaninagar.madani.shura_committee.model.MemberInfoData
import com.madaninagar.madani.shura_committee.view.adapter.RecyclerAdapter1
import com.madaninagar.madani.shura_committee.view.adapter.RecyclerAdapter2

class ShuraCommitteeActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityShuraCommitteeBinding
    private lateinit var recyclerAdapter1: RecyclerAdapter1
    private lateinit var recyclerAdapter2: RecyclerAdapter2
    private lateinit var recyclerAdapter3: RecyclerAdapter2


    // = = = = = Declare Data Properties = = = = = //

    private lateinit var dataList1: List<MemberInfoData>
    private lateinit var dataList2: List<CommitteeMemberData>

    private var isFirstContentExpanded: Boolean = false
    private var isSecondContentExpanded: Boolean = false
    private var isThirdContentExpanded: Boolean = false
    private var isFourthContentExpanded: Boolean = false

    private val TAG: String = "MadaniCommitteeActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShuraCommitteeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()
        initListeners()

    }

    private fun initComponents() {
        binding.toolbar.tvToolbarTitle.text = getString(R.string.shura_and_committee)

        generateDummyList1()
        generateDummyList2()

        // = = = Content 1 RecyclerView Declaration = = = //
        binding.rvCommittee1.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter1 = RecyclerAdapter1(this, dataList1)
        binding.rvCommittee1.adapter = recyclerAdapter1
        // = = = Content 2 RecyclerView Declaration = = = //
        binding.rvCommittee2.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter2 = RecyclerAdapter2(this, dataList2)
        binding.rvCommittee2.adapter = recyclerAdapter2

        // = = = Content 3 RecyclerView Declaration = = = //
        binding.rvCommittee3.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter3 = RecyclerAdapter2(this, dataList2)
        binding.rvCommittee3.adapter = recyclerAdapter3

    }

    private fun initListeners() {
        binding.toolbar.ivToolbarBack.setOnClickListener { finish() }

        binding.tvCommitteeRank1.setOnClickListener {
            isFirstContentExpanded = !isFirstContentExpanded
            binding.rvCommittee1.isVisible = isFirstContentExpanded
        }

        binding.tvCommitteeRank2.setOnClickListener {
            isSecondContentExpanded = !isSecondContentExpanded
            binding.rvCommittee2.isVisible = isSecondContentExpanded
        }

        binding.tvCommitteeRank3.setOnClickListener {
            isThirdContentExpanded = !isThirdContentExpanded
            binding.rvCommittee3.isVisible = isThirdContentExpanded
        }
    }

    private fun generateDummyList1() {

        dataList1 = ArrayList()
        dataList1 = dataList1 + MemberInfoData(1, "মোঃ রেজাউল করিম")
        dataList1 = dataList1 + MemberInfoData(2, "মোঃ রেজাউল করিম")
        dataList1 = dataList1 + MemberInfoData(3, "মোঃ রেজাউল করিম")
        dataList1 = dataList1 + MemberInfoData(4, "মোঃ রেজাউল করিম")
        dataList1 = dataList1 + MemberInfoData(5, "মোঃ রেজাউল করিম")

    }

    private fun generateDummyList2() {

        dataList2 = ArrayList()
        dataList2 = dataList2 + CommitteeMemberData(1, "মোঃ রেজাউল করিম", "01841752600", "2010")
        dataList2 = dataList2 + CommitteeMemberData(2, "মোঃ রেজাউল করিম", "01841752600", "2011")
        dataList2 = dataList2 + CommitteeMemberData(3, "মোঃ রেজাউল করিম", "01841752600", "2012")
        dataList2 = dataList2 + CommitteeMemberData(4, "মোঃ রেজাউল করিম", "01841752600", "2013")
        dataList2 = dataList2 + CommitteeMemberData(5, "মোঃ রেজাউল করিম", "01841752600", "2014")
        dataList2 = dataList2 + CommitteeMemberData(6, "মোঃ রেজাউল করিম", "01841752600", "2015")
        dataList2 = dataList2 + CommitteeMemberData(7, "মোঃ রেজাউল করিম", "01841752600", "2016")
        dataList2 = dataList2 + CommitteeMemberData(8, "মোঃ রেজাউল করিম", "01841752600", "2017")
        dataList2 = dataList2 + CommitteeMemberData(9, "মোঃ রেজাউল করিম", "01841752600", "2018")
        dataList2 = dataList2 + CommitteeMemberData(10, "মোঃ রেজাউল করিম", "01841752600", "2019")

    }
}