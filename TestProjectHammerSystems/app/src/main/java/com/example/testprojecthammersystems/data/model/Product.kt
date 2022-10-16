package com.example.testprojecthammersystems.data.model

data class Product(
    val description: String,
    val id: Int,
    val image_url: String,
    val name: String,
    val prices: List<Price>,
    val tag: String
)

data class Price(
    val price: Int,
    val size: Double
)