package com.madaninagar.madani.publication.model

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madaninagar.madani.databinding.ItemBooksBinding

class RecyclerAdapter(context: Context, dataSet: List<Data>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var dataList: List<Data> = dataSet
    private var context: Context = context
    var onItemClick: ((Data) -> Unit)? = null

    class ViewHolder(val binding: ItemBooksBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = ItemBooksBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.binding.tvMonth.text = dataList[position].month
        viewHolder.binding.tvYear.text = dataList[position].year

        viewHolder.binding.cardView.setOnClickListener {

            onItemClick?.invoke(dataList[position])

            //TODO Click listener will send click information to activity

        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataList.size

}
