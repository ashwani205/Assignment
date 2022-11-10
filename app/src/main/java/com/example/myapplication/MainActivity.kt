package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.NewItemAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.NewItem

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setItemRV()
    }

    private fun setItemRV() {
        val adapter = NewItemAdapter()
        val item = arrayListOf<NewItem>()
        item.add(
            NewItem(
                image = "https://images.dailyobjects.com/marche/product-images/1202/all-clove-commute-messenger-large-images/All-Clove-Commute-Messenger-Large-vw.png?tr=cm-pad_resize,w-640,h-459,dpr-1",
                name = "All Clove Commute"
            )
        )
        item.add(
            NewItem(
                image = "https://images.dailyobjects.com/marche/product-images/1202/ivory-clove-commute-messenger-large-images/Ivory-Clove-Commute-Messenger-Large-2n.png?tr=cm-pad_resize,w-292,h-360,dpr-1",
                name = "Ivory - Clove Commute Messenger "
            )
        )
        item.add(
            NewItem(
                image = "https://images.dailyobjects.com/marche/product-images/1202/terracotta-red-bask-messenger-bag-images/Terracotta-Red-Bask-Messenger-Bag.png?tr=cm-pad_resize,w-640,h-459,dpr-1",
                name = "Terracotta Red Bask Messenger Bag"
            )
        )
        item.add(
            NewItem(
                image = "https://images.dailyobjects.com/marche/product-images/1202/space-blue-bask-messenger-bag-images/Space-Blue-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-292,h-360,dpr-1",
                name = "Space Blue Bask Messenger Bag"
            )
        )
        binding.itemRv.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.itemRv.adapter = adapter
        adapter.submitList(item)
    }
}