package com.example.learnjc.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.learnjc.data.QuranViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val qViewModelModule = module {
    viewModel { QuranViewModel (get()) }
}
