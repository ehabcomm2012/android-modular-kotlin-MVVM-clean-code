package com.ehab.modular.popular_people_list.presentation.popular_people_list

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.ehab.modular.commons.base_ui.BaseViewModel
import com.ehab.modular.domain.models.PopularPerson
import com.ehab.modular.domain.popular_people_list.networkRepos.PopularPeopleListNetworkRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import utils.AppConstants
import java.lang.Exception


class PupularPeopleListViewModel constructor(val PopularPeopleListNetworkRepo: PopularPeopleListNetworkRepo) :
    BaseViewModel() {
    init {
        getPopularPeopleList()
    }

    fun getPopularPeopleList() {
        flow<List<PopularPerson>?> {

                try {

                    val popularPersonList = PopularPeopleListNetworkRepo.getPopularPeopleList(
                        AppConstants.API_KEY,
                        AppConstants.LANGUAGE_US,
                        1
                    )
                  emit(popularPersonList)
                }catch (e:Exception){
                    emit(null)
                }


        }.flowOn(Dispatchers.IO)
            .onEach { popularPersonList ->
                Log.v("coroutine viewModel", Thread.currentThread().name)
            }.launchIn(viewModelScope)


    }
}