package com.project.gms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.gms.Communication.CommunicationWork
import com.project.gms.DTO.LogInDTO
import com.project.gms.databinding.ActivityLoginBinding
import retrofit2.Retrofit
import java.util.Random

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.resetPasswordBtn.setOnClickListener {
            val intent = Intent(this, ReLoginActivity::class.java)
            startActivity(intent)
        }

        binding.loginBtn.setOnClickListener {
            val userLoginData = LogInDTO(
                binding.idEditText.text.toString(),
                binding.passwordEditText.text.toString()
            )
            val retrofitWork = CommunicationWork()
            retrofitWork.loginInfoSend(userLoginData, this)

        }
    }
}