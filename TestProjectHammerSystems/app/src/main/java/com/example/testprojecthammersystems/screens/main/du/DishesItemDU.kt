package com.example.testprojecthammersystems.screens.main.du

import androidx.recyclerview.widget.DiffUtil
import com.example.testprojecthammersystems.data.model.DishesItem


class DishesItemDU : DiffUtil.ItemCallback<DishesItem>() {
    override fun areItemsTheSame(p0: DishesItem, p1: DishesItem): Boolean {
        return p0.id == p1.id
    }

    override fun areContentsTheSame(p0: DishesItem, p1: DishesItem): Boolean {
        return p0 == p1
    }
}