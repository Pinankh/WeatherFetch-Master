package com.pinankh.weatherproject.data.repositories
/**
 * Created by @Author Pinankh Patel on 11,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.weatherproject.data.datasources.openweather.ForecastResponseService
import com.pinankh.weatherproject.domain.models.ForecastResponseModel
import javax.inject.Inject

class ForecastResponseRepository @Inject constructor(
    private val api: ForecastResponseService
){

    suspend fun getForecastResponse(latitude: Float, longitude: Float): ForecastResponseModel {
        return api.getForecastResponse(latitude, longitude)
    }

    suspend fun getForecastResponse(geoId: String): ForecastResponseModel {
        return api.getForecastResponse(geoId)
    }
}
