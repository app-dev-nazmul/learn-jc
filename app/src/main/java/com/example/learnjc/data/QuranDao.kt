package com.example.learnjc.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface QuranDao {
    @Query("Select * from sura")
    fun readAllSura(): Flow<List<SuraModel>>

}