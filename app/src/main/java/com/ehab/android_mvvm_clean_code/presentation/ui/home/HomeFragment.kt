package com.ehab.android_mvvm_clean_code.presentation.ui.home

import com.ehab.android_mvvm_clean_code.R
import com.ehab.android_mvvm_clean_code.core.BaseFragment

class HomeFragment : BaseFragment<HomeViewModel>() {
    override fun layoutId(): Int {
        return R.layout.fragment_home
    }

    override fun viewModelBuilder(): HomeViewModel {
       return  HomeViewModel()
    }

    override fun getViewModelClass(): Class<HomeViewModel> {
       return HomeViewModel::class.java
    }

    override fun subscribeObservers() {
      //  TODO("Not yet implemented")
    }


}