package com.example.learnjc.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow

class QuranViewModel(private val quranDao: QuranDao): ViewModel() {
    val readAllSura:  Flow<List<SuraModel>> = quranDao.readAllSura()
}