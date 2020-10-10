package com.ehab.android_mvvm_clean_code.presentation.ui.popularPeopleList

import com.ehab.android_mvvm_clean_code.core.BaseActivity
import com.ehab.android_mvvm_clean_code.core.BaseFragment

class PupularPeopleActivity : BaseActivity() {
    override fun fragment(): BaseFragment<*> {
       return PupularPeopleFragment()
    }
}