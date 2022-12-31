package com.project.gms.Retorfit

import com.project.gms.Interface.SignUpService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitAPI{
    private const val BASE_URL = "https://port-0-gms-backend-3vw25lc9xo7pg.gksl2.cloudtype.app/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val emgMedService: SignUpService by lazy {
        retrofit.create(SignUpService::class.java)
    }
}