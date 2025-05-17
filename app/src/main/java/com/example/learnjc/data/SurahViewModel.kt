package com.example.learnjc.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow

class SurahViewModel(private val dao: SuraDao) : ViewModel() {
    val readAllSurah: Flow<List<Surah>> = dao.readSurah()
}