package com.example.testprojecthammersystems.screens.main.viewHolder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testprojecthammersystems.R
import com.example.testprojecthammersystems.core.extentions.setImage
import com.example.testprojecthammersystems.data.model.Product
import com.example.testprojecthammersystems.data.model.ProductItem
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.item_product_price_button.view.*


class ProductVH(val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(item: Product) {
        val image = view.findViewById<ImageView>(R.id.product_img)
        val title = view.findViewById<TextView>(R.id.product_name)
        val description = view.findViewById<TextView>(R.id.product_description)
        val button = view.findViewById<MaterialButton>(R.id.price_button)

        image.setImage(item.image_url)
        title.text = item.name
        description.text = item.description
        button.text = String.format(view.resources.getString(R.string.price_start), item.prices[0].price.toString() )

    }

    companion object {
        fun create(parentView: ViewGroup): ProductVH {
            return ProductVH(
                LayoutInflater.from(parentView.context)
                    .inflate(R.layout.item_product, parentView, false)
            )
        }
    }
}