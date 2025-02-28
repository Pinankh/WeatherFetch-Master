package com.pinankh.weatherproject.data.datasources.openweather
/**
 * Created by @Author Pinankh Patel on 11,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */

import com.pinankh.weatherproject.domain.models.CityInfoModel
import com.pinankh.weatherproject.domain.models.ForecastResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {
    @GET("/data/2.5/weather")
    suspend fun getCityInfo(
        @Query("lat") latitude: Float?,
        @Query("lon") longitude: Float?,
        @Query("appid") apiKey: String,
        @Query("units") units: String,
        @Query("lang") lang: String
    ): Response<CityInfoModel>

    @GET("/data/2.5/weather")
    suspend fun getCityInfo(
        @Query("id") geoId: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String,
        @Query("lang") lang: String
    ): Response<CityInfoModel>

    @GET("/data/2.5/forecast")
    suspend fun getForecastResponse(
        @Query("lat") latitude: Float?,
        @Query("lon") longitude: Float?,
        @Query("appid") apiKey: String,
        @Query("units") units: String,
        @Query("lang") lang: String
    ): Response<ForecastResponseModel>

    @GET("/data/2.5/forecast")
    suspend fun getForecastResponse(
        @Query("id") geoId: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String,
        @Query("lang") lang: String
    ): Response<ForecastResponseModel>
}
