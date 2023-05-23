package com.lovely.api_retrofit

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitAlbemClient {
    private val BASE_URL="https://jsonplaceholder.typicode.com"
    var httpLoggingInterceptor: HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    var okHTTP: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .connectTimeout(20, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)
        .writeTimeout(20, TimeUnit.SECONDS)
        .build()

    private val retrofitAlbemClient: Retrofit.Builder by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHTTP)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))

    }
    val placeHolderInterface :placeHolderInterface by lazy {
        retrofitAlbemClient.build().create(placeHolderInterface::class.java)
    }
}