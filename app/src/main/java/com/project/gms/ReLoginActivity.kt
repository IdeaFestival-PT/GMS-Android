package com.project.gms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.gms.databinding.ActivityLoginBinding
import com.project.gms.databinding.ActivityReLoginBinding
import java.util.Random


class ReLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityReLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.loginBtn.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
    }
}