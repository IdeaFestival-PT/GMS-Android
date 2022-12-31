package com.project.gms

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.project.gms.databinding.ActivityViewRecyclerRestaurantBinding

class RestaurantRecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewRecyclerRestaurantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityViewRecyclerRestaurantBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d("TAG","인텐트 성공")

        val restaurantList = mutableListOf<Restaurant>()

        restaurantList.add(Restaurant("윤밀원(한식)", "주소 : 경기 성남시 분당구 백현로 154", "전화번호 : 031-714-8388"))
        restaurantList.add(Restaurant("이름", "주소", "전화번호"))
        restaurantList.add(Restaurant("이름", "주소", "전화번호"))

        val recyclerView = binding.list
        recyclerView.adapter = RecyclerViewAdapter(restaurantList, LayoutInflater.from(this), this)

        recyclerView.addItemDecoration(
            RecyclerDecoration(50)
        )
    }
}

