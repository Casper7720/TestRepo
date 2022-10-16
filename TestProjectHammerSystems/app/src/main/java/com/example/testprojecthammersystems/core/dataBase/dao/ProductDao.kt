package com.example.testprojecthammersystems.core.dataBase.dao

import androidx.room.*
import com.example.testprojecthammersystems.data.entity.ProductEntity


@Dao
interface ProductDao {
    @Query("SELECT * FROM ProductEntity")
    fun getAll(): List<ProductEntity>

    @Query("SELECT * FROM ProductEntity WHERE id IN (:id)")
    fun loadAllByIds(id: Int): List<ProductEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(entities: List<ProductEntity>)

    @Delete
    fun delete(productEntity: ProductEntity)
}