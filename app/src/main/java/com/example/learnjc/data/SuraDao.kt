package com.example.learnjc.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SuraDao {
    @Query("Select * from sura")
    fun readSurah(): Flow<List<Surah>>
}