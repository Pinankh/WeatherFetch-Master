package com.pinankh.weatherproject

import android.app.Application
import android.widget.Toast
import dagger.hilt.android.HiltAndroidApp
/**
 * Created by @Author Pinankh Patel on 6,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */

@HiltAndroidApp
class WeatherApplication : Application() {
    fun showToast(message: String?) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}