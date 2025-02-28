package com.pinankh.weatherproject.utils
/**
 * Created by @Author Pinankh Patel on 15,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.weatherproject.BuildConfig

const val BASE_URL: String = "https://api.openweathermap.org/"
const val API_KEY: String = BuildConfig.OPENWEATHER_KEY
var UNITS: String = "metric"
var LANG: String = "en"
const val TRI_HOURS_IN_DAY: Int = 8
const val AFTERNOON_TIME_INDEX: Int = 4
const val GPS_REQUEST_CODE = 1