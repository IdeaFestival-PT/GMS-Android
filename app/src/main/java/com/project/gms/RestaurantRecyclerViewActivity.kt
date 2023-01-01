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
        Log.d("TAG","인텐트 성공 ")

        val restaurantList = mutableListOf<Restaurant>()
        var category = intent.getStringExtra("category")
        var location = intent.getStringExtra("location")
        Log.d("TAG","$category")
        if (location == "광주") {
            if (category == "None") {
                restaurantList.add(
                    Restaurant(
                        "백운동 낭만 닭곰탕(한식)",
                        "주소 : 광주광역시 남구 백운로 49-1 ",
                        "전화번호 : 062-653-3232"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "용봉동 숯과 닭발(한식)",
                        "주소 : 광주광역시 북구 용봉택지로 91",
                        "전화번호 : 062-527-1588"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "형제 송정 떡갈비(한식)",
                        "주소 : 광주광역시 광산구 송정동 828-1 1층",
                        "전화번호 : 062-944-0595"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "아까(ACA)(양식)",
                        "주소 : 광주광역시 남구 천변좌로428번길 14-1",
                        "전화번호 : 062-676-0518"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "하고스(양식)",
                        "주소 : 광주광역시 동구 천변우로 405-15",
                        "전화번호 : 062-236-1408"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "구르메키친(양식)",
                        "주소 : 광주광역시 서구 마륵로 108 일로빌딩 2F",
                        "전화번호 : 062-385-2335"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "유향(중식)",
                        "주소 : 광주광역시 광산구 용아로 400번길 33",
                        "전화번호 : 062-954-9530"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "제일반점(중식)",
                        "주소 : 광주광역시 동구 구성로 174",
                        "전화번호 : 062-224-6670"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "신락원(중식)",
                        "주소 : 광주광역시 동구 충장로 45-5",
                        "전화번호 : 062-225-9409"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "스시담(일식)",
                        "주소 : 광주광역시 광산구 임방울대로 335",
                        "전화번호 : 062-956-1254"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "쌍학(일식)",
                        "주소 : 광주광역시 동구 구성로152번길 13",
                        "전화번호 : 062-225-5200"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "시바카레(일식)",
                        "주소 : 광주광역시 동구 제봉로110번길 17 1F",
                        "전화번호 : 070-8864-1818"
                    )
                )
            } else if (category == "KOREA") {
                restaurantList.add(
                    Restaurant(
                        "백운동 낭만 닭곰탕(한식)",
                        "주소 : 광주광역시 남구 백운로 49-1 ",
                        "전화번호 : 062-653-3232"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "용봉동 숯과 닭발(한식)",
                        "주소 : 광주광역시 북구 용봉택지로 91",
                        "전화번호 : 062-527-1588"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "형제 송정 떡갈비(한식)",
                        "주소 : 광주광역시 광산구 송정동 828-1 1층",
                        "전화번호 : 062-944-0595"
                    )
                )
            } else if (category == "CHINA") {
                restaurantList.add(
                    Restaurant(
                        "유향(중식)",
                        "주소 : 광주광역시 광산구 용아로 400번길 33",
                        "전화번호 : 062-954-9530"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "제일반점(중식)",
                        "주소 : 광주광역시 동구 구성로 174",
                        "전화번호 : 062-224-6670"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "신락원(중식)",
                        "주소 : 광주광역시 동구 충장로 45-5",
                        "전화번호 : 062-225-9409"
                    )
                )
            } else if (category == "JAPAN") {
                restaurantList.add(
                    Restaurant(
                        "스시담(일식)",
                        "주소 : 광주광역시 광산구 임방울대로 335",
                        "전화번호 : 062-956-1254"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "쌍학(일식)",
                        "주소 : 광주광역시 동구 구성로152번길 13",
                        "전화번호 : 062-225-5200"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "시바카레(일식)",
                        "주소 : 광주광역시 동구 제봉로110번길 17 1F",
                        "전화번호 : 070-8864-1818"
                    )
                )
            } else if (category == "WESTERN") {
                restaurantList.add(
                    Restaurant(
                        "아까(ACA)(양식)",
                        "주소 : 광주광역시 남구 천변좌로428번길 14-1",
                        "전화번호 : 062-676-0518"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "하고스(양식)",
                        "주소 : 광주광역시 동구 천변우로 405-15",
                        "전화번호 : 062-236-1408"
                    )
                )
                restaurantList.add(
                    Restaurant(
                        "구르메키친(양식)",
                        "주소 : 광주광역시 서구 마륵로 108 일로빌딩 2F",
                        "전화번호 : 062-385-2335"
                    )
                )
            }
        }
        else{
            
        }

        val recyclerView = binding.list
        recyclerView.adapter = RecyclerViewAdapter(restaurantList, LayoutInflater.from(this), this)

        recyclerView.addItemDecoration(
            RecyclerDecoration(50)
        )
    }
}

