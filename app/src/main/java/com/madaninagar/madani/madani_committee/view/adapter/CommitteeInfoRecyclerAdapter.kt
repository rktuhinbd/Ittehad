package com.madaninagar.madani.madani_committee.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madaninagar.madani.databinding.ItemMawlanaContactBinding
import com.madaninagar.madani.madani_committee.model.CommitteeMemberData

class CommitteeInfoRecyclerAdapter(context: Context, dataSet: List<CommitteeMemberData>) :
    RecyclerView.Adapter<CommitteeInfoRecyclerAdapter.ViewHolder>() {

    private var context: Context = context

    private var dataList: List<CommitteeMemberData> = dataSet

    var onItemClick: ((CommitteeMemberData) -> Unit)? = null

    class ViewHolder(val binding: ItemMawlanaContactBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemMawlanaContactBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        holder.binding.tvName.text = dataList[position].name
        holder.binding.tvYear.text = dataList[position].year
        holder.binding.tvPhoneNumber.text = dataList[position].phoneNumber

        holder.binding.cardView.setOnClickListener {
            onItemClick?.invoke(dataList[position])
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataList.size


}
