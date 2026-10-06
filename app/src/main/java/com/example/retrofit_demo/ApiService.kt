package com.example.retrofit_demo

import retrofit2.http.GET

interface ApiService {
    @GET("posts") // Endpoint relativo
    suspend fun getPosts(): List<Post>
}