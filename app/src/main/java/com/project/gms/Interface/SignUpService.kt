package com.project.gms.Interface

import com.project.gms.DTO.*
import retrofit2.Call
import retrofit2.http.*

interface SignUpService{
    @Headers("Content-Type: application/json")
    @POST("/email/send")
    fun emailSend(@Body emailInfo: EmailSendDTO): Call<Unit>

    @Headers("Content-Type: application/json")
    @HEAD("/email")
    fun emailProve(
        @Query("authKey") authKey: String,
        @Query("email") email: String
    ): Call<Void>

    @Headers("Content-Type: application/json")
    @POST("/member/signup")
    fun clientInfo(@Body clientInfo: ClientDTO): Call<Unit>

    @Headers("Content-Type: application/json")
    @POST("/member/login")
    fun loginInfo(@Body loginInfo: LogInDTO): Call<Unit>

    @Headers("Content-Type: application/json")
    @GET("/restaurant/search")
    fun serchInfo(
        @Query("location") location: String,
        @Query("category") category: Category
    ): Call<List<ResultDTO>>
}