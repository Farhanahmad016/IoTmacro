package com.example.iotmacrochallange

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.iotmacrochallange.databinding.ListRoomBinding

class PlanListAdapter(private val map: List<MapViewModel>) : RecyclerView.Adapter<PlanListAdapter.ViewHolder>()  {

    inner class ViewHolder(
        val mapBinding: ListRoomBinding
    ) : RecyclerView.ViewHolder(mapBinding.root)

    override fun getItemCount() = map.size

    // membuat view baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_room, parent, false)
    )

    // memasang list item ke view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val mapViewModel = map[position]

        // sets the image to the imageview from our itemHolder class
        holder.mapBinding.chkListRoom.text = mapViewModel.name

    }
}