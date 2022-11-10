package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.myapplication.NewItemViewHolder
import com.example.myapplication.databinding.NewItemBinding
import com.example.myapplication.model.NewItem

class NewItemAdapter : ListAdapter<NewItem, NewItemViewHolder>(NewItemDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewItemViewHolder {
        return NewItemViewHolder(NewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: NewItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}