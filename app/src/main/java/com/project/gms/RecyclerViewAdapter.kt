package com.project.gms

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.project.gms.databinding.ItemRecyclerBinding

class RecyclerViewAdapter(
    val restaurantList: MutableList<Restaurant>,
    val inflater: LayoutInflater,
    val context: Context
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root){

        val restaurantImage: ImageView
        val restaurantName: TextView
        val restaurantAddress: TextView
        val restaurantPhoneNumber: TextView

        init {
            restaurantImage = binding.restaurantImage
            restaurantName = binding.restaurantName
            restaurantAddress = binding.restaurantAddress
            restaurantPhoneNumber = binding.restaurantPhoneNumber
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(ItemRecyclerBinding.bind(view))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.restaurantImage?.setImageDrawable(
            context.resources.getDrawable(R.drawable.gms_logo, context.theme)
        )
        holder.restaurantName.text = restaurantList.get(position).restaurantName
        holder.restaurantAddress.text = restaurantList.get(position).restaurantAddress
        holder.restaurantPhoneNumber.text = restaurantList.get(position).restaurantPhoneNumber

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView?.context, RecyclerDetailActivity::class.java)
            intent.putExtra("restaurantName", holder.restaurantName.text.toString())
            intent.putExtra("restaurantAddress", holder.restaurantAddress.text.toString())
            intent.putExtra("restaurantPhoneNumber", holder.restaurantPhoneNumber.text.toString())
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }
}