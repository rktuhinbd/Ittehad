package com.madaninagar.madani.shura_committee.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madaninagar.madani.databinding.ItemMemberBinding
import com.madaninagar.madani.shura_committee.model.MemberInfoData

class RecyclerAdapter1(context: Context, dataSet: List<MemberInfoData>) :
    RecyclerView.Adapter<RecyclerAdapter1.ViewHolder>() {

    private var context: Context = context
    private var dataList: List<MemberInfoData> = dataSet

    var onItemClick: ((MemberInfoData) -> Unit)? = null

    class ViewHolder(val binding: ItemMemberBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemMemberBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.binding.tvName.text = dataList[position].name
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataList.size

}
