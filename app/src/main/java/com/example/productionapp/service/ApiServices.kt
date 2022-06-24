package com.example.productionapp.service

import com.example.productionapp.model.UserInfo
import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Header


interface ApiServices {
    @GET("/users")
    fun getUserInfo(): Call<List<UserInfo>>
}