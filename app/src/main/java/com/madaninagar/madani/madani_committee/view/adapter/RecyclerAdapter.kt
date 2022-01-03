package com.madaninagar.madani.madani_committee.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.madaninagar.madani.databinding.ItemCommitteeBinding
import com.madaninagar.madani.madani_committee.model.Data

class RecyclerAdapter(context: Context, dataSet: List<Data>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var context: Context = context
    private lateinit var recyclerAdapter: CommitteeInfoRecyclerAdapter

    private var dataList: List<Data> = dataSet

    var onItemClick: ((Data) -> Unit)? = null

    class ViewHolder(val binding: ItemCommitteeBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemCommitteeBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.binding.tvCommitteeRank.text = dataList[position].committeeRank

        viewHolder.binding.cardView.setOnClickListener {

            onItemClick?.invoke(dataList[position])

            if (dataList[position].isExpanded) {
                dataList[position].isExpanded = false
                viewHolder.binding.rvCommitteeMemberInfo.visibility = View.GONE
            } else {
                dataList[position].isExpanded = true
                viewHolder.binding.rvCommitteeMemberInfo.visibility = View.VISIBLE

                viewHolder.binding.rvCommitteeMemberInfo.layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                recyclerAdapter = CommitteeInfoRecyclerAdapter(context, dataList[position].data)
                viewHolder.binding.rvCommitteeMemberInfo.adapter = recyclerAdapter
            }

        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataList.size

}
