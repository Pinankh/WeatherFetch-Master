package com.pinankh.weatherproject.framework.ui.searchList
/**
 * Created by @Author Pinankh Patel on 10,February,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pinankh.weatherproject.R
import com.pinankh.weatherproject.domain.models.CityInfoModel
import com.pinankh.weatherproject.domain.models.SearchItemModel

class SearchItemsAdapter(
    private var searchItemList: List<SearchItemModel>,
    private var cityInfoList: List<CityInfoModel>,
    private var onClickListener: (SearchItemModel) -> Unit
) : RecyclerView.Adapter<SearchItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SearchItemViewHolder(layoutInflater.inflate(R.layout.search_item, parent, false))
    }

    override fun onBindViewHolder(holder: SearchItemViewHolder, position: Int) {
        val item = searchItemList[position]
        val itemCityInfo = cityInfoList[position]

        holder.render(item, onClickListener, itemCityInfo)
    }

    override fun getItemCount(): Int = searchItemList.size
}
