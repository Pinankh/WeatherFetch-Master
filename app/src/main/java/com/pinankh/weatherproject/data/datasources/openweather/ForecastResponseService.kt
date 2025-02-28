package com.pinankh.weatherproject.data.datasources.openweather
/**
 * Created by @Author Pinankh Patel on 11,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.weatherproject.domain.models.ForecastResponseModel
import com.pinankh.weatherproject.utils.API_KEY
import com.pinankh.weatherproject.utils.LANG
import com.pinankh.weatherproject.utils.UNITS
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class ForecastResponseService @Inject constructor(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val api: ApiClient
) {
    suspend fun getForecastResponse(latitude: Float, longitude: Float): ForecastResponseModel {
        return withContext(dispatcher) {
            val response: Response<ForecastResponseModel> = api.getForecastResponse(latitude, longitude, API_KEY, UNITS, LANG)
            response.body()!!
        }
    }

    suspend fun getForecastResponse(geoId: String): ForecastResponseModel {
        return withContext(dispatcher) {
            val response: Response<ForecastResponseModel> = api.getForecastResponse(geoId, API_KEY, UNITS, LANG)
            response.body()!!
        }
    }

}
