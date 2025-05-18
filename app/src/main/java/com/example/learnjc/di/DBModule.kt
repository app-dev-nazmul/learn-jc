package com.example.learnjc.di

import android.app.Application
import androidx.room.Room
import com.example.learnjc.data.QuranDao
import com.example.learnjc.data.QuranDatabase
import org.koin.dsl.module

val dbModule = module {
    single {
        val db = Room.databaseBuilder(get<Application>(), QuranDatabase::class.java, "quran.db")
            .createFromAsset("database/quran.db")
            .build()
        db
    }
    single<QuranDao> { get<QuranDatabase>().QuranDao() }
}