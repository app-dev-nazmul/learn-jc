package com.example.learnjc.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SuraModel::class], version = 1, exportSchema = true)
abstract class QuranDatabase: RoomDatabase() {
    abstract fun QuranDao() : QuranDao
}