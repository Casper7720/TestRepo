package com.example.testprojecthammersystems.screens.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.testprojecthammersystems.data.model.DishesItem
import com.example.testprojecthammersystems.screens.main.du.DishesItemDU
import com.example.testprojecthammersystems.screens.main.viewHolder.DishesVH


class DishesAdapter: ListAdapter<DishesItem, DishesVH>(DishesItemDU()) {

    private var list: List<DishesItem> = ArrayList()
    private var listener: DishesVH.DishAction? = null

    fun setData(list: List<DishesItem>) {
        this.list = list
        submitList(this.list)
    }

    fun setListener(listener: DishesVH.DishAction){
        this.listener = listener
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishesVH {
        return DishesVH.create(parent)
    }

    override fun onBindViewHolder(holder: DishesVH, position: Int) {
        return holder.bind(list[position], listener)
    }
}