package com.madaninagar.madani.home.view.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.madaninagar.madani.asatijaye_keram.view.AsatijayeKeramActivity
import com.madaninagar.madani.collect_information.CollectInformationActivity
import com.madaninagar.madani.contact.ContactActivity
import com.madaninagar.madani.data_store.DataStore
import com.madaninagar.madani.databinding.ActivityHomeBinding
import com.madaninagar.madani.fujala_wa_abna.view.FujalaWaAbnaActivity
import com.madaninagar.madani.publication.view.PublicationActivity
import com.madaninagar.madani.shura_committee.view.activity.ShuraCommitteeActivity
import com.madaninagar.madani.sonwari_jimmadar.view.activity.SonwariJimmadarActivity

const val TAG = "tag-tag"

class HomeActivity : AppCompatActivity() {

    // = = = = = Declare View Properties = = = = = //

    private lateinit var binding: ActivityHomeBinding

    // = = = = = Declare Data Properties = = = = = //

    private var isCommitteeExpanded: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()

        Log.d(TAG, "onCreate: name " + DataStore.studentNames.size)
        Log.d(TAG, "onCreate: f name " + DataStore.studentFathersName.size)
        Log.d(TAG, "onCreate: c num " + DataStore.studentContactList.size)
        Log.d(TAG, "onCreate: vc " + DataStore.villageCurrent.size)
        Log.d(TAG, "onCreate: vo  " + DataStore.villageOriginal.size)
        Log.d(TAG, "onCreate: po  " + DataStore.postOriginal.size)
        Log.d(TAG, "onCreate: pc  " + DataStore.postCurrent.size)
        Log.d(TAG, "onCreate: to  " + DataStore.thanaCurrent.size)
        Log.d(TAG, "onCreate: tc  " + DataStore.thanaOriginal.size)
        Log.d(TAG, "onCreate: zo  " + DataStore.zilaOriginal.size)
        Log.d(TAG, "onCreate: zc  " + DataStore.zilaCurrent.size)

    }

    private fun initComponents() {

        binding.btnAsatijayeKeram.setOnClickListener {
            startActivity(Intent(this@HomeActivity, AsatijayeKeramActivity::class.java))
        }

        binding.btnSonwariJimmadar.setOnClickListener {
            startActivity(Intent(this@HomeActivity, SonwariJimmadarActivity::class.java))
        }

        binding.btnFujalaWaAbna.setOnClickListener {
            startActivity(Intent(this@HomeActivity, FujalaWaAbnaActivity::class.java))
        }

        binding.btnShuraCommittee.setOnClickListener {
            isCommitteeExpanded = !isCommitteeExpanded
            binding.layoutCommittee.isVisible = isCommitteeExpanded
        }

        binding.tvCommitteeRank1.setOnClickListener {
            startActivity(Intent(this@HomeActivity, ShuraCommitteeActivity::class.java))
        }

        binding.tvCommitteeRank2.setOnClickListener {
            startActivity(Intent(this@HomeActivity, ShuraCommitteeActivity::class.java))
        }

        binding.tvCommitteeRank3.setOnClickListener {
            startActivity(Intent(this@HomeActivity, ShuraCommitteeActivity::class.java))
        }

        binding.btnInformation.setOnClickListener {
            startActivity(Intent(this@HomeActivity, CollectInformationActivity::class.java))
        }

        binding.btnElan.setOnClickListener {
            startActivity(Intent(this@HomeActivity, SonwariJimmadarActivity::class.java))
        }

        binding.btnPublication.setOnClickListener {
            startActivity(Intent(this@HomeActivity, PublicationActivity::class.java))
        }

        binding.btnContact.setOnClickListener {
            startActivity(Intent(this@HomeActivity, ContactActivity::class.java))
        }
    }
}