package com.example.myapplication

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.NewItemBinding
import com.example.myapplication.model.NewItem

class NewItemViewHolder(private val binding: NewItemBinding):RecyclerView.ViewHolder(binding.root) {

    fun bind(item: NewItem){
        binding.name.text = item.name
        Glide.with(binding.root).load(item.image).placeholder(R.drawable.img1).into(binding.imageView)
    }
}