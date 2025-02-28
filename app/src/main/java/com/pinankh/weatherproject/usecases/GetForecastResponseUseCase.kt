package com.pinankh.weatherproject.usecases
/**
 * Created by @Author Pinankh Patel on 18,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.weatherproject.data.repositories.ForecastResponseRepository
import com.pinankh.weatherproject.domain.models.ForecastResponseModel
import javax.inject.Inject

class GetForecastResponseUseCase @Inject constructor(
    private val repository: ForecastResponseRepository
) {

    suspend fun getForecastResponse(latitude: Float, longitude: Float): ForecastResponseModel =
        repository.getForecastResponse(latitude, longitude)

    suspend fun getForecastResponse(geoId: String): ForecastResponseModel =
        repository.getForecastResponse(geoId)

}
