package com.pinankh.weatherproject.domain.models
/**
 * Created by @Author Pinankh Patel on 17,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
data class NextDayInfoModel(
    val iconId: String,
    val temperatures: MutableList<Double>,
    val averageTemp: Int,
    val lowestTemp: Int,
    val highestTemp: Int
)