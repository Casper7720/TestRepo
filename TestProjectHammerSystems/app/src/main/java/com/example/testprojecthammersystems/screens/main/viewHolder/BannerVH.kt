package com.example.testprojecthammersystems.screens.main.viewHolder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testprojecthammersystems.R
import com.example.testprojecthammersystems.data.model.BannerItem


class BannerVH(val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(item: BannerItem) {
        val image = view.findViewById<ImageView>(R.id.banner_image)

        image.setImageDrawable(view.resources.getDrawable(R.drawable.banner_1))
    }

    companion object {
        fun create(parentView: ViewGroup): BannerVH {
            return BannerVH(
                LayoutInflater.from(parentView.context)
                    .inflate(R.layout.item_banner, parentView, false)
            )
        }
    }
}