package com.twenk11k.clbs2fragments.di

import com.twenk11k.clbs2fragments.ui.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel() }

}