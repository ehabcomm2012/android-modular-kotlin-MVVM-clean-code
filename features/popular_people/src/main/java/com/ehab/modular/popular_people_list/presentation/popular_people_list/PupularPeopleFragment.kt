package com.ehab.modular.popular_people_list.presentation.popular_people_list

import com.ehab.modular.commons.base_ui.BaseFragment
import com.ehab.modular.popular_people_list.R
import com.ehab.modular.popular_people_list.data.popular_people_list.PopularPeopleListRepositoryImpl
import com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.retrofit.PopularPeopleListApiService
import network.NetworkBuilder


class PupularPeopleFragment : BaseFragment<PupularPeopleViewModel>() {
    override fun layoutId(): Int {
        return R.layout.fragment_pupular_people_list
    }

    override fun viewModelBuilder(): PupularPeopleViewModel {
       return  PupularPeopleViewModel(PopularPeopleListRepositoryImpl(NetworkBuilder.provideApiService(
           PopularPeopleListApiService::class.java
       )))
    }

    override fun getViewModelClass(): Class<PupularPeopleViewModel> {
       return PupularPeopleViewModel::class.java
    }

    override fun subscribeObservers() {
      //  TODO("Not yet implemented")
    }


}