package com.ehab.modular.commons.base_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<VM : BaseViewModel>:Fragment() {
    lateinit var viewModel: VM
    abstract fun layoutId(): Int
    private val factory = BaseViewModelFactory(::viewModelBuilder)
    abstract fun viewModelBuilder(): VM
    abstract fun getViewModelClass(): Class<VM>
    abstract fun subscribeObservers()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(layoutId(), container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = createViewModel(factory) {}
        subscribeObservers()
    }

    private inline fun createViewModel(
        factory: ViewModelProvider.Factory,
        body: VM.() -> Unit
    ): VM {
        val vm = ViewModelProvider(this, factory) [getViewModelClass()]
        vm.body()
        return vm
    }
    open fun onBackPressed() {}

}