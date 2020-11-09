package com.ehab.modular.popular_people_list.presentation.popular_people_list

import com.ehab.modular.commons.base_ui.BaseActivity
import com.ehab.modular.commons.base_ui.BaseFragment


class PupularPeopleListActivity : BaseActivity() {
    override fun fragment(): BaseFragment<*> {
       return PupularPeopleListFragment()
    }
}