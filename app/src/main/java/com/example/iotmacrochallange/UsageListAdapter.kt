package com.example.iotmacrochallange

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.iotmacrochallange.databinding.ListUsageBinding

class UsageListAdapter (private val usage: List<UsageViewModel>) : RecyclerView.Adapter<UsageListAdapter.ViewHolder>() {

    inner class ViewHolder(
        val usageBinding: ListUsageBinding
    ) : RecyclerView.ViewHolder(usageBinding.root)

    override fun getItemCount() = usage.size

    // membuat view baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_usage, parent, false)
    )

    // memasang list item ke view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val usageViewModel = usage[position]

        // sets the image to the imageview from our itemHolder class
        holder.usageBinding.imgUsage.setImageResource(usageViewModel.img)

        holder.usageBinding.tvInfo.text = usageViewModel.info

        holder.usageBinding.tvPercentage.text = usageViewModel.percentage

        holder.usageBinding.tvFix.text = usageViewModel.fix

    }
}