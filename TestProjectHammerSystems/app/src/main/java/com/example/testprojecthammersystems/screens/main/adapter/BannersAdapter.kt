package com.example.testprojecthammersystems.screens.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.testprojecthammersystems.data.model.BannerItem
import com.example.testprojecthammersystems.screens.main.du.BannerItemDU
import com.example.testprojecthammersystems.screens.main.viewHolder.BannerVH


class BannersAdapter: ListAdapter<BannerItem, BannerVH>(BannerItemDU()) {

    private var list: List<BannerItem> = ArrayList()

    fun setData(list: List<BannerItem>) {
        this.list = list
        submitList(this.list)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerVH {
        return BannerVH.create(parent)
    }

    override fun onBindViewHolder(holder: BannerVH, position: Int) {
        return holder.bind(list[position])
    }
}