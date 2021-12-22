package com.madaninagar.madani.asatijaye_keram.view

import android.R.attr
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madaninagar.madani.asatijaye_keram.model.Data
import com.madaninagar.madani.databinding.ItemAsatijayeKeramBinding


class RecyclerAdapter(context: Context, dataSet: List<Data>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var dataList: List<Data> = dataSet
    private var context: Context = context
    var onItemClick: ((Data) -> Unit)? = null

    class ViewHolder(val binding: ItemAsatijayeKeramBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemAsatijayeKeramBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.binding.tvIndex.text = (position + 1).toString()
        viewHolder.binding.tvName.text = dataList[position].name
        viewHolder.binding.tvContact.text = dataList[position].phone
        viewHolder.binding.tvAddress.text = dataList[position].address
        viewHolder.binding.tvVillage.text = dataList[position].village
        viewHolder.binding.tvPost.text = dataList[position].postOffice
        viewHolder.binding.tvThana.text = dataList[position].thana
        viewHolder.binding.tvZilla.text = dataList[position].zilla

        viewHolder.binding.ivCall.setOnClickListener {
            showDialer(dataList[position].phone)
        }

        viewHolder.binding.ivMessage.setOnClickListener {
            composeSmsMessage(dataList[position].phone)
        }

        viewHolder.binding.cardView.setOnClickListener {

            onItemClick?.invoke(dataList[position])

            //TODO Click listener will send click information to activity
            if (dataList[position].isExpanded) {
                viewHolder.binding.layoutAddress.visibility = View.GONE
                dataList[position].isExpanded = false
            } else {
                viewHolder.binding.layoutAddress.visibility = View.VISIBLE
                dataList[position].isExpanded = true
            }

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