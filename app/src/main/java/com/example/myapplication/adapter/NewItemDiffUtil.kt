package com.example.myapplication.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.myapplication.model.NewItem

class NewItemDiffUtil:DiffUtil.ItemCallback<NewItem>() {
    override fun areItemsTheSame(oldItem: NewItem, newItem: NewItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: NewItem, newItem: NewItem): Boolean {
        return oldItem == newItem
    }
}