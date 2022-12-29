package com.project.gms.Communication

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.project.gms.DTO.ClientDTO
import com.project.gms.DTO.EmailSendDTO
import com.project.gms.DTO.LogInDTO
import com.project.gms.LoginActivity
import com.project.gms.R
import com.project.gms.Retorfit.RetrofitAPI
import com.project.gms.SearchActivity
import com.project.gms.fragment.SignUpFragment1
import retrofit2.Call
import retrofit2.Response


class CommunicationWork() {
    fun sendEmail(emailInfo: EmailSendDTO){
        val service = RetrofitAPI.emgMedService

        service.emailSend(emailInfo)
            .enqueue(object : retrofit2.Callback<Unit>{
                override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
                    if (response.isSuccessful){
                        val result = response.body()
                        Log.d("email 전송 성공", "$result")
                    }
                }

                override fun onFailure(call: Call<Unit>, t: Throwable) {
                    Log.d("email 전송 실패", t.message.toString())
                }
            })
    }

    fun emailCodeSend(authKey: String, email: String, context: SignUpFragment1) {
        val service = RetrofitAPI.emgMedService

        service.emailProve(authKey, email)
            .enqueue(object : retrofit2.Callback<Void> {
                override fun onResponse(call: Call<Void>, response: Response<Void>) {
                    if (response.isSuccessful) {
                        val result = response.body()
                        Log.d("통신 성공", "$result")
                        context.findNavController().navigate(R.id.action_signUpFragment1_to_signUpFragment2, bundleOf("email" to email))
                    }
                }

                override fun onFailure(call: Call<Void>, t: Throwable) {
                    Log.d("통신 실패", t.message.toString())
                }

            })
    }

    fun clientInfoSend(clientInfo: ClientDTO, context: Context?){
        val service = RetrofitAPI.emgMedService

        service.clientInfo(clientInfo)
            .enqueue(object  : retrofit2.Callback<Unit> {
                override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
                    if (response.isSuccessful){
                        val result = response.body()
                        Log.d("통신 성공", "$result")
                        val intent = Intent(context, LoginActivity::class.java)
                        context?.startActivity(intent)
                    }
                }

                override fun onFailure(call: Call<Unit>, t: Throwable) {
                    Log.d("통신 실패", t.message.toString())
                }

            })
    }

    fun loginInfoSend(loginInfo: LogInDTO, context: Context){
        val service = RetrofitAPI.emgMedService

        service.loginInfo(loginInfo)
            .enqueue(object : retrofit2.Callback<Unit>{
                override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
                    if (response.isSuccessful) {
                        val result = response.body()
                        Log.d("통신 성공", "$result")
                        val intent = Intent(context, SearchActivity::class.java)
                        context.startActivity(intent)
                    }
                }

                override fun onFailure(call: Call<Unit>, t: Throwable) {
                    Log.d("통신 실패", t.message.toString())
                }
            })

    }
}

