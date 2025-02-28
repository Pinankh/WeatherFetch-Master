package com.pinankh.weatherproject.domain.models
/**
 * Created by @Author Pinankh Patel on 17,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.google.gson.annotations.SerializedName
import com.pinankh.weatherproject.domain.models.common.IconIdModel
import com.pinankh.weatherproject.domain.models.common.MainInfoModel

data class ForecastInfoModel (
    @SerializedName("main") val mainInfo: MainInfoModel,
    @SerializedName("weather") val iconId: List<IconIdModel>, //The list is to be able to parse the JSON correctly
    @SerializedName("dt_txt") val date: String
)
