package com.example.learnjc.di

import android.app.Application
import androidx.room.Room
import com.example.learnjc.data.QuranDatabase
import com.example.learnjc.data.SuraDao
import org.koin.dsl.module
import android.util.Log

val databaseModule = module {
    single {
        val startTime = System.currentTimeMillis() // For benchmarking

        val db = Room.databaseBuilder(get<Application>(), QuranDatabase::class.java, "quran.db")
            .createFromAsset("database/quran.db")
            // Disable schema validation temporarily if needed during development
            //.fallbackToDestructiveMigration()
            .build()

        val endTime = System.currentTimeMillis()
        Log.d("DatabasePerf", "DB Init Time: ${endTime - startTime}ms")

        db
    }

    single<SuraDao> { get<QuranDatabase>().SuraDao() }
}
