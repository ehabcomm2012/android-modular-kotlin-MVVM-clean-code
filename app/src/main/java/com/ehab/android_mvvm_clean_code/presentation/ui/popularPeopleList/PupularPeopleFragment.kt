package com.ehab.android_mvvm_clean_code.presentation.ui.popularPeopleList

import com.ehab.android_mvvm_clean_code.R
import com.ehab.android_mvvm_clean_code.core.BaseFragment

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