package com.example.iotmacrochallange

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.iotmacrochallange.databinding.ListItemDeviceBinding

class DeviceListAdapter(private val device: List<DeviceViewModel>) : RecyclerView.Adapter<DeviceListAdapter.ViewHolder>() {

    inner class ViewHolder(
        val deviceBinding: ListItemDeviceBinding
    ) : RecyclerView.ViewHolder(deviceBinding.root)

    override fun getItemCount() = device.size

    var listener: DeviceRecyclerClickListener? = null

    // membuat view baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_device, parent, false)
    )

    // memasang list item ke view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val deviceViewModel = device[position]

        // sets the image to the imageview from our itemHolder class
        holder.deviceBinding.deviceImage.setImageResource(deviceViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.deviceBinding.tvDeviceName.text = deviceViewModel.name

        holder.deviceBinding.tvDeviceStatus.text = deviceViewModel.status

        holder.deviceBinding.listDevice.setOnClickListener{
            listener?.onItemClicked(it, deviceViewModel)
        }

    }

    // return the number of the items in the list


}
