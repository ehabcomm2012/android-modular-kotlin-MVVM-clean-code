package com.ehab.modular.commons.base_ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ehab.modular.commons.R

abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_base)
       replaceFragment(savedInstanceState)
    }

    override fun onBackPressed() {
        (supportFragmentManager
            .findFragmentById(R.id.fragmentContainer) as BaseFragment<*>).onBackPressed()
        super.onBackPressed()
    }

    private fun replaceFragment(savedInstanceState: Bundle?) =
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,  fragment())
            .commit()

    abstract fun fragment(): BaseFragment<*>
}