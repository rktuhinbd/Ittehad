package com.madaninagar.madani.madani_committee.view.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madaninagar.madani.databinding.ItemMawlanaContactBinding
import com.madaninagar.madani.madani_committee.model.CommitteeMemberData

class CommitteeRecyclerAdapter(context: Context, dataSet: List<CommitteeMemberData>) :
    RecyclerView.Adapter<CommitteeRecyclerAdapter.ViewHolder>() {

    private var dataList: List<CommitteeMemberData> = dataSet
    private var context: Context = context
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
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.binding.tvName.text = dataList[position].name
        viewHolder.binding.tvPhoneNumber.text = dataList[position].phoneNumber
        viewHolder.binding.tvYear.text = dataList[position].year

        viewHolder.binding.ivCall.setOnClickListener {
            showDialer(dataList[position].phoneNumber)
        }

        viewHolder.binding.ivMessage.setOnClickListener {
            composeSmsMessage(dataList[position].phoneNumber)
        }
    }

    private fun showDialer(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        context.startActivity(intent)
    }

    private fun composeSmsMessage(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.data = Uri.parse("smsto:+88$phoneNumber") // This ensures only SMS apps respond
        intent.putExtra("sms_body", "")
        context.startActivity(intent)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataList.size

}
