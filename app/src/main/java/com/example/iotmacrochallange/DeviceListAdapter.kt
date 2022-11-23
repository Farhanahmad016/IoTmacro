package com.example.iotmacrochallange

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DeviceListAdapter(private val device: List<DeviceViewModel>) : RecyclerView.Adapter<DeviceListAdapter.ViewHolder>() {

    // membuat view baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // inflates list item view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_device, parent, false)

        return ViewHolder(view)
    }

    // memasang list item ke view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val deviceViewModel = device[position]

        // sets the image to the imageview from our itemHolder class
        holder.deviceImage.setImageResource(deviceViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.deviceName.text = deviceViewModel.name

        holder.deviceStatus.text = deviceViewModel.status

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return device.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val deviceImage: ImageView = itemView.findViewById(R.id.device_image)
        val deviceName: TextView = itemView.findViewById(R.id.tv_deviceName)
        val deviceStatus: TextView = itemView.findViewById(R.id.tv_DeviceStatus)
    }
}
