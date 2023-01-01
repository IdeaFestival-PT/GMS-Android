package com.project.gms

import com.project.gms.DTO.Category

data class Restaurant(
    val restaurantName: String,
    val restaurantAddress: String,
    val restaurantPhoneNumber: String,
    val restaurantCategory: Category
)