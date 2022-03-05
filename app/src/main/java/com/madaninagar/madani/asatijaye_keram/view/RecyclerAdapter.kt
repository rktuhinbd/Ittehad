package com.madaninagar.madani.asatijaye_keram.view

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madaninagar.madani.asatijaye_keram.model.Data
import com.madaninagar.madani.databinding.ItemMawlanaInforamtionBinding

class RecyclerAdapter(context: Context, dataSet: List<Data>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var dataList: List<Data> = dataSet
    private var context: Context = context
    var onItemClick: ((Data) -> Unit)? = null

    class ViewHolder(val binding: ItemMawlanaInforamtionBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemMawlanaInforamtionBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.binding.tvIndex.text = (position + 1).toString()
        viewHolder.binding.tvName.text = dataList[position].name
        viewHolder.binding.tvContact.text = dataList[position].phone

        viewHolder.binding.ivCall.setOnClickListener {
            showDialer(dataList[position].phone)
        }

        viewHolder.binding.ivMessage.setOnClickListener {
            composeSmsMessage(dataList[position].phone)
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
