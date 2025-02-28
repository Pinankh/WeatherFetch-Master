package com.pinankh.weatherproject.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import com.pinankh.weatherproject.framework.helpers.DataStoreHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by @Author Pinankh Patel on 14,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
private const val USER_PREFERENCES = "USER_PREFERENCES"

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Singleton
    @Provides
    fun providePreferencesDataStore(@ApplicationContext appContext: Context): DataStore<Preferences> {
        return PreferenceDataStoreFactory.create(produceFile = {
            appContext.preferencesDataStoreFile(
                USER_PREFERENCES
            )
        })
    }

    @Singleton
    @Provides
    fun provideDataStoreHelper(dataStore: DataStore<Preferences>): DataStoreHelper {
        return DataStoreHelper(dataStore)
    }
}