package com.app.physcoroapp.retrofit

import com.app.physcoroapp.model.ProductItem
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitAPI {
    @GET("products")
    suspend fun getProducts():Response<List<ProductItem>>
}