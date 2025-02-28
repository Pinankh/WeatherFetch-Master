package com.pinankh.weatherproject.domain.models
/**
 * Created by @Author Pinankh Patel on 17,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.google.gson.annotations.SerializedName

data class ForecastResponseModel (
    @SerializedName("list") val forecastInfoModels: List<ForecastInfoModel>
)
