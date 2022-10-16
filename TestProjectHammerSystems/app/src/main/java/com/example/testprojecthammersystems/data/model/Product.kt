package com.example.testprojecthammersystems.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Product(
    val description: String,
    val id: Int,
    val image_url: String,
    val name: String,
    val prices: List<Price>,
    val tag: String
)

@Parcelize
data class Price(
    val price: Int,
    val size: Double
): Parcelable