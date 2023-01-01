package com.project.gms

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.project.gms.DTO.Category
import com.project.gms.DTO.ResultDTO
import com.project.gms.databinding.ActivityViewRecyclerRestaurantBinding

class RestaurantRecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewRecyclerRestaurantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityViewRecyclerRestaurantBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d("TAG","인텐트 성공 ")

        val restaurantList = mutableListOf<ResultDTO>()
        restaurantList.add(ResultDTO(name = "광주소프트웨어마이스터고등학교 (한식)", address = "광주광역시 광산구 송정동 상무대로 312", contact = "062-949-6800", imageUrl = "", category = Category.None))
        restaurantList.add(ResultDTO(name = "광주소프트웨어마이스터고등학교 (한식)", address = "광주광역시 광산구 송정동 상무대로 312", contact = "062-949-6800", imageUrl = "", category = Category.None))
        restaurantList.add(ResultDTO(name = "광주소프트웨어마이스터고등학교 (한식)", address = "광주광역시 광산구 송정동 상무대로 312", contact = "062-949-6800", imageUrl = "", category = Category.None))
        restaurantList.add(ResultDTO(name = "광주소프트웨어마이스터고등학교 (한식)", address = "광주광역시 광산구 송정동 상무대로 312", contact = "062-949-6800", imageUrl = "", category = Category.None))
        restaurantList.add(ResultDTO(name = "광주소프트웨어마이스터고등학교 (한식)", address = "광주광역시 광산구 송정동 상무대로 312", contact = "062-949-6800", imageUrl = "", category = Category.None))
        restaurantList.add(ResultDTO(name = "광주소프트웨어마이스터고등학교 (한식)", address = "광주광역시 광산구 송정동 상무대로 312", contact = "062-949-6800", imageUrl = "", category = Category.None))


        val recyclerView = binding.list
        recyclerView.adapter = RecyclerViewAdapter(restaurantList, LayoutInflater.from(this), this)

        recyclerView.addItemDecoration(
            RecyclerDecoration(50)
        )
    }
}

