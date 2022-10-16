package com.example.testprojecthammersystems.screens.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.testprojecthammersystems.data.model.Product
import com.example.testprojecthammersystems.screens.main.du.ProductItemDU
import com.example.testprojecthammersystems.screens.main.viewHolder.ProductVH


class ProductsAdapter: ListAdapter<Product, ProductVH>(ProductItemDU()) {

    private var list: List<Product> = ArrayList()

    fun setData(list: List<Product>) {
        this.list = list
        submitList(this.list)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {
        return ProductVH.create(parent)
    }

    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        return holder.bind(list[position])
    }
}