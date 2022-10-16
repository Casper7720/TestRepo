package com.example.testprojecthammersystems.screens.main.du

import androidx.recyclerview.widget.DiffUtil
import com.example.testprojecthammersystems.data.model.BannerItem


class BannerItemDU : DiffUtil.ItemCallback<BannerItem>() {
    override fun areItemsTheSame(p0: BannerItem, p1: BannerItem): Boolean {
        return p0.id == p1.id
    }

    override fun areContentsTheSame(p0: BannerItem, p1: BannerItem): Boolean {
        return p0 == p1
    }
}