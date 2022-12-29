package com.project.gms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.gms.databinding.ActivityRecyclerDetailBinding

class RecyclerDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecyclerDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.restaurantNameText.text = intent.getStringExtra("restaurantName")
        binding.foodText.text = intent.getStringExtra("restaurantAddress")
        binding.restaurantDetailPhoneNumber.text = intent.getStringExtra("restaurantPhoneNumber")

    }
}