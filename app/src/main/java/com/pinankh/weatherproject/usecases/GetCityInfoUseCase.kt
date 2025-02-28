package com.pinankh.weatherproject.usecases
/**
 * Created by @Author Pinankh Patel on 18,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.weatherproject.data.repositories.CityInfoRepository
import com.pinankh.weatherproject.domain.models.CityInfoModel
import com.pinankh.weatherproject.domain.models.SearchItemModel
import javax.inject.Inject

class GetCityInfoUseCase @Inject constructor(
    private val repository: CityInfoRepository
) {
    suspend fun getCityInfo(latitude: Float, longitude: Float): CityInfoModel =
        repository.getCityInfo(latitude, longitude)

    suspend fun getCityInfo(geoId: String): CityInfoModel? = repository.getCityInfo(geoId)
    suspend fun getCityInfoList(searchItemList: List<SearchItemModel>): List<CityInfoModel> {
        val cityInfoList: MutableList<CityInfoModel> = arrayListOf()
        searchItemList.forEach { searchItem ->
            getCityInfo(searchItem.geonameid)?.let { cityInfoList.add(it) }
        }
        return cityInfoList
    }
}
