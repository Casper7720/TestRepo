package com.example.testprojecthammersystems.core.api

import com.example.testprojecthammersystems.data.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("/pizzas")
    fun listRepos(): Call<List<Product>>
}