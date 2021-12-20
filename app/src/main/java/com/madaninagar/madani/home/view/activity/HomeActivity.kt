package com.madaninagar.madani.home.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.madaninagar.madani.R
import com.madaninagar.madani.abnaye_rahmania.AbnayeRahmaniaActivity
import com.madaninagar.madani.asatijaye_keram.AsatijayeKeramActivity
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
                    val i = Intent(this@HomeActivity, AsatijayeKeramActivity::class.java)
                    startActivity(i)
                }
                2 -> {
                    val i = Intent(this@HomeActivity, AbnayeRahmaniaActivity::class.java)
                    startActivity(i)
                }
                3 -> {
                    val i = Intent(this@HomeActivity, MadaniCommitteeActivity::class.java)
                    startActivity(i)
                }
                4 -> {
                    val i = Intent(this@HomeActivity, JamatProtinidheeActivity::class.java)
                    startActivity(i)
                }
                5 -> {
                    val i = Intent(this@HomeActivity, UpdateInformationActivity::class.java)
                    startActivity(i)
                }
                6 -> {
                    val i = Intent(this@HomeActivity, DimashikmadaniActivity::class.java)
                    startActivity(i)
                }
            }
        }
    }

    private fun generateDummyList(): ArrayList<Data> {
        val dataList = ArrayList<Data>()

        dataList += Data(1, "আসাতিযায়ে কেরাম", R.drawable.ic_king_crown)
        dataList += Data(2, "আবনায়ে রাহমানিয়া", R.drawable.ic_king_crown)
        dataList += Data(3, "মাদানী কমিটি", R.drawable.ic_king_crown)
        dataList += Data(4, "জামাত প্রতিনিধি", R.drawable.ic_king_crown)
        dataList += Data(5, "তথ্য সংস্করণ", R.drawable.ic_king_crown)
        dataList += Data(6, "দ্বি-মাসিক মাদানী", R.drawable.ic_king_crown)

        return dataList
    }
}