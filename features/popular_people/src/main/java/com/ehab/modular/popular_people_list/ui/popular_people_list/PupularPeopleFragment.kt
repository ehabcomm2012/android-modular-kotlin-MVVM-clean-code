package com.ehab.modular.popular_people_list.ui.popular_people_list

import com.ehab.modular.commons.base_ui.BaseFragment
import com.ehab.modular.popular_people_list.R


class PupularPeopleFragment : BaseFragment<PupularPeopleViewModel>() {
    override fun layoutId(): Int {
        return R.layout.fragment_pupular_people_list
    }

    override fun viewModelBuilder(): PupularPeopleViewModel {
       return  PupularPeopleViewModel()
    }

    override fun getViewModelClass(): Class<PupularPeopleViewModel> {
       return PupularPeopleViewModel::class.java
    }

    override fun subscribeObservers() {
      //  TODO("Not yet implemented")
    }


}