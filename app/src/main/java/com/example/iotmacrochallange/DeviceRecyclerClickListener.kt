package com.example.iotmacrochallange

import android.view.View

interface DeviceRecyclerClickListener {

    fun onItemClicked(view: View, device :DeviceViewModel)
}