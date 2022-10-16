package com.example.testprojecthammersystems.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testprojecthammersystems.data.model.Price

@Entity
data class ProductEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String? = null,
    @ColumnInfo(name = "description") val description: String? = null,
    @ColumnInfo(name = "image_url") val image_url: String? = null,
    @ColumnInfo(name = "tag") val tag: String? = null,
    @ColumnInfo(name = "prices") val prices: List<Price> = listOf()
)