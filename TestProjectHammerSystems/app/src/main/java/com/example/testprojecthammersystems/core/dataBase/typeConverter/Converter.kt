package com.example.testprojecthammersystems.core.dataBase.typeConverter

import androidx.room.TypeConverter
import com.example.testprojecthammersystems.data.model.Price
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class Converter {

    private val priceModelTokenType = object : TypeToken<List<Price>>() {}.type

    @TypeConverter
    fun stringToPriceModelList(value: String?): List<Price>? {
        value ?: return null
        return Gson().fromJson(value, priceModelTokenType)
    }

    @TypeConverter
    fun priceToString(date: List<Price>?): String? {
        date ?: return null
        val gson = Gson()
        return gson.toJson(date, priceModelTokenType)
    }
}