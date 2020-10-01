package com.ehab.android_mvvm_clean_code.presentation.ui.home

import com.ehab.android_mvvm_clean_code.core.BaseActivity
import com.ehab.android_mvvm_clean_code.core.BaseFragment

class HomeActivity : BaseActivity() {
    override fun fragment(): BaseFragment<*> {
       return HomeFragment()
    }
}