package com.example.data_ghibli

import retrofit2.Call
import retrofit2.http.GET

interface Api {

    companion object {
        const val BASE_URL = "https://nekos.best"
    }

    @GET("/api/v2/husbando")
    fun getHusbandos(): Call<List<Images>>
}