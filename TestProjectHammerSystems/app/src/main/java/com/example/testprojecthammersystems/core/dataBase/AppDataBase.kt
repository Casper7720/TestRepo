package com.example.testprojecthammersystems.core.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.testprojecthammersystems.core.dataBase.dao.ProductDao
import com.example.testprojecthammersystems.core.dataBase.typeConverter.Converter
import com.example.testprojecthammersystems.data.entity.ProductEntity


@Database(entities = [ProductEntity::class], version = 1)
@TypeConverters(Converter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}