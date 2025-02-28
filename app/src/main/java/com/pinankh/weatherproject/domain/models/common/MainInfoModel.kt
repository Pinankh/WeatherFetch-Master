package com.pinankh.weatherproject.domain.models.common
/**
 * Created by @Author Pinankh Patel on 17,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.google.gson.annotations.SerializedName

data class MainInfoModel (
    val temp: Double,
    @SerializedName("feels_like") val thermalSensation: Double,
    val humidity: Int
)
