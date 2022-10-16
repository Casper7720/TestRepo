package com.example.testprojecthammersystems.data.model

data class ProductItem(
    var id: Long = System.currentTimeMillis(),
    var title: String = "",
    var description: String = "",
    var price: Int
)
