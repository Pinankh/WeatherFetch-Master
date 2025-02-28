package com.pinankh.weatherproject.di
/**
 * Created by @Author Pinankh Patel on 14,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.algolia.search.client.ClientSearch
import com.algolia.search.client.Index
import com.algolia.search.dsl.ranking
import com.algolia.search.dsl.searchableAttributes
import com.algolia.search.dsl.settings
import com.algolia.search.model.APIKey
import com.algolia.search.model.ApplicationID
import com.algolia.search.model.IndexName
import com.algolia.search.model.settings.Settings
import com.pinankh.weatherproject.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object SearchModule {

    @ViewModelScoped
    @Provides
    fun provideClientSearch(): ClientSearch {
        val applicationID = BuildConfig.ALGOLIA_APP_ID
        val algoliaAPIKey = BuildConfig.ALGOLIA_KEY
        return ClientSearch(ApplicationID(applicationID), APIKey(algoliaAPIKey))
    }

    @ViewModelScoped
    @Provides
    fun provideIndex(clientSearch: ClientSearch): Index {
        val algoliaIndexName = BuildConfig.ALGOLIA_INDEX_NAME
        return clientSearch.initIndex(IndexName(algoliaIndexName))
    }

    @ViewModelScoped
    @Provides
    fun provideSettings(): Settings {
        return settings {
            searchableAttributes {
                +"name"
            }
            ranking {
                +Attribute
                +Geo
                +Words
                +Filters
                +Exact
            }
            hitsPerPage = 10
        }
    }
}