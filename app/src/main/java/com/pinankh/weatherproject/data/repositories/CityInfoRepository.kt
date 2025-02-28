package com.pinankh.weatherproject.data.repositories
/**
 * Created by @Author Pinankh Patel on 11,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.weatherproject.data.datasources.openweather.CityInfoService
import com.pinankh.weatherproject.domain.models.CityInfoModel
import javax.inject.Inject

class CityInfoRepository @Inject constructor(
    private val api: CityInfoService
) {
    suspend fun getCityInfo(latitude: Float, longitude: Float): CityInfoModel {
        return api.getCityInfo(latitude, longitude)
    }

    suspend fun getCityInfo(geoId: String): CityInfoModel? {
        return api.getCityInfo(geoId)
    }
}