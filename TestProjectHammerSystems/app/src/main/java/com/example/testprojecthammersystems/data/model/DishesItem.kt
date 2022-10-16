package com.example.testprojecthammersystems.data.model

data class DishesItem(
    var id: Long = System.currentTimeMillis(),
    var text: String = "",
    var isChecked: Boolean = false
)
