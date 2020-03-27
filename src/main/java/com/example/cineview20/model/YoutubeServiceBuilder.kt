package com.example.cineview20.model

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object YoutubeServiceBuilder {
    private const val URL = "https://www.googleapis.com/youtube/v3/"

    // Create Logger
    private val logger = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    // Create a Custom Interceptor to apply Headers application wide
    private val headerInterceptor = Interceptor { chain ->
        var request = chain.request()

        request = request.newBuilder()
            .addHeader("X-Android-Package", "com.example.cineview20")
            .addHeader("X-Android-Cert","AB:1F:53:D7:7A:50:8C:99:53:9D:C7:EC:0A:ED:45:C3:43:27:18:D0")
            .build()

        val response = chain.proceed(request)
        response
    }

    // Create OkHttp Client
    private val okHttp = OkHttpClient.Builder()
        .callTimeout(5, TimeUnit.SECONDS)
        .addInterceptor(headerInterceptor)
        .addInterceptor(logger)

    // Create Retrofit Builder
    private val builder = Retrofit.Builder().baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())

    // Create Retrofit Instance
    private val retrofit = builder.build()

    fun <T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }
}