package com.example.data_ghibli.http

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.Request

class HttpHelper {
    fun get(){
        val URL = "https://nekos.best/api/v2/hug?amount=2"

        val client = OkHttpClient()

        val request = Request.Builder().url(URL).get().build()

        val response = client.newCall(request).execute()

        val responseBody = response.body()

        if (responseBody != null){
            val json = responseBody.string()
            println("Resposta ======>" + json)
        }
    }
}