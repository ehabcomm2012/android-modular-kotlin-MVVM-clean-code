package com.ehab.modular.popular_people_list.presentation.popular_people_list

import com.ehab.modular.commons.base_ui.BaseFragment
import com.ehab.modular.popular_people_list.R
import com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.retrofit.PopularPeopleListRetrofitApi
import com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.retrofit.PopularPeopleListRetrofitRepo
import network.NetworkBuilder


class PupularPeopleListFragment : BaseFragment<PupularPeopleListViewModel>() {
    override fun layoutId(): Int {
        return R.layout.fragment_pupular_people_list
    }

    override fun viewModelBuilder(): PupularPeopleListViewModel {
       return  PupularPeopleListViewModel(PopularPeopleListRetrofitRepo(NetworkBuilder.provideApiService(
           PopularPeopleListRetrofitApi::class.java
       )))
    }

    override fun getViewModelClass(): Class<PupularPeopleListViewModel> {
       return PupularPeopleListViewModel::class.java
    }

    override fun subscribeObservers() {
      //  TODO("Not yet implemented")
    }


}