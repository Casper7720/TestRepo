package com.example.testprojecthammersystems.screens.main.viewHolder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testprojecthammersystems.R
import com.example.testprojecthammersystems.data.model.BannerItem
import com.example.testprojecthammersystems.data.model.DishesItem
import com.google.android.material.button.MaterialButton


class DishesVH(val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(item: DishesItem, listener: DishAction?) {
        val button = view.findViewById<MaterialButton>(R.id.dish_btn)

        button.text = item.text
        if(item.isChecked){
            button.setBackgroundColor(view.resources.getColor(R.color.opacityBasePink))
            button.setTextColor(view.resources.getColor(R.color.basePink))
        }
        else{
            button.setBackgroundColor(view.resources.getColor(R.color.white))
            button.setTextColor(view.resources.getColor(R.color.baseGrey))
        }

        button.setOnClickListener { listener?.onDishClick(position) }

    }

    interface DishAction{
        fun onDishClick(position: Int)
    }

    companion object {
        fun create(parentView: ViewGroup): DishesVH {
            return DishesVH(
                LayoutInflater.from(parentView.context)
                    .inflate(R.layout.item_dish, parentView, false)
            )
        }
    }
}