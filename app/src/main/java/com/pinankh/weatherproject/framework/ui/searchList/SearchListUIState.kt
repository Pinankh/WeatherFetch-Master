package com.pinankh.weatherproject.framework.ui.searchList
/**
 * Created by @Author Pinankh Patel on 10,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.weatherproject.domain.models.ItemModel

sealed class SearchListUIState {
    data object Loading : SearchListUIState()
    data object NotFound : SearchListUIState()
    data class Success(val searchValues: ItemModel) : SearchListUIState()
    data class Error(val msg: String) : SearchListUIState()
}