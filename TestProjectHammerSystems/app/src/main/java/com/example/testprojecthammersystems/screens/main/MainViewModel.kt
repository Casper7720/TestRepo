package com.example.testprojecthammersystems.screens.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testprojecthammersystems.core.Api
import com.example.testprojecthammersystems.data.model.DishesItem
import com.example.testprojecthammersystems.data.model.Product
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel() {

    var listProduct: MutableLiveData<List<Product>?> = MutableLiveData(null)
    var listDishes: MutableLiveData<List<DishesItem>?> = MutableLiveData(
        listOf(
            DishesItem(text = "Пицца", isChecked = true),
            DishesItem(text = "Бургеры"),
            DishesItem(text = "Закуски"),
            DishesItem(text = "Напитки"),
            DishesItem(text = "Пицца"),
            DishesItem(text = "Бургеры"),
            DishesItem(text = "Закуски"),
            DishesItem(text = "Напитки")
        )
    )


    fun getPizzaData() {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://c653bc30-393a-40b4-82b0-d0fcaac50c6f.mock.pstmn.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: Api = retrofit.create(Api::class.java)

        service.listRepos().enqueue(object : Callback<List<Product>> {
            override fun onResponse(call: Call<List<Product>>, response: Response<List<Product>>) {
                listProduct.value = response.body()
            }

            override fun onFailure(call: Call<List<Product>>, t: Throwable) {}

        })
    }
}