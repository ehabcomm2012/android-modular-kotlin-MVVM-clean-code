package com.ehab.modular.popular_people_list.presentation.popular_people_list

import androidx.lifecycle.viewModelScope
import com.ehab.modular.commons.base_ui.BaseViewModel
import com.ehab.modular.domain.network.PopularPeopleListRepository
import kotlinx.coroutines.launch
import utils.AppConstants


class PupularPeopleViewModel constructor(val popularPeopleListRepository : PopularPeopleListRepository) : BaseViewModel(){
init {
    //getPopularPeopleList()
}
    fun getPopularPeopleList(){
        viewModelScope.launch {
            popularPeopleListRepository.getPopularPeopleList(
                AppConstants.API_KEY,
                AppConstants.LANGUAGE_US,
                1
            )
        }
        }
}