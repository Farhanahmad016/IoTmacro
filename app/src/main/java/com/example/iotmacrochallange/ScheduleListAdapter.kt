package com.example.iotmacrochallange

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.iotmacrochallange.databinding.ListScheduleBinding
import com.example.iotmacrochallange.databinding.ListUsageBinding

class ScheduleListAdapter (private val schedule: List<ScheduleViewModel>) : RecyclerView.Adapter<ScheduleListAdapter.ViewHolder>() {

    inner class ViewHolder(
        val scheduleBinding: ListScheduleBinding
    ) : RecyclerView.ViewHolder(scheduleBinding.root)

    override fun getItemCount() = schedule.size

    // membuat view baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_schedule, parent, false)
    )

    // memasang list item ke view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val usageViewModel = schedule[position]

        // sets the image to the imageview from our itemHolder class
        holder.scheduleBinding.tvTime.text = usageViewModel.time

        holder.scheduleBinding.tvRepetition.text = usageViewModel.repetition


    }
}