package com.example.learnjc.di

import com.example.learnjc.data.SurahViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SurahViewModel(get()) }
}