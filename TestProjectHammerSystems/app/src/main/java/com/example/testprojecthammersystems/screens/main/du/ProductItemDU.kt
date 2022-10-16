package com.example.testprojecthammersystems.screens.main.du

import androidx.recyclerview.widget.DiffUtil
import com.example.testprojecthammersystems.data.model.Product


class ProductItemDU : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(p0: Product, p1: Product): Boolean {
        return p0.id == p1.id
    }

    override fun areContentsTheSame(p0: Product, p1: Product): Boolean {
        return p0 == p1
    }
}