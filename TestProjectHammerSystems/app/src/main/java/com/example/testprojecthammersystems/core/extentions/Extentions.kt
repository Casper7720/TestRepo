package com.example.testprojecthammersystems.core.extentions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.setImage(url: String){
    Glide
        .with(this.context)
        .load(url)
        .centerCrop()
        .into(this)
}
