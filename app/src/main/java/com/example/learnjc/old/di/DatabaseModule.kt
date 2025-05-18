//package com.example.learnjc.old.di
//
//import android.app.Application
//import androidx.room.Room
//import com.example.learnjc.old.QuranDatabase
//import com.example.learnjc.old.SuraDao
//import org.koin.dsl.module
//
//val databaseModule = module {
//    single {
//        val db = Room.databaseBuilder(get<Application>(), QuranDatabase::class.java, "quran.db")
//            .createFromAsset("database/quran.db")
//            .build()
//        db
//    }
//
//    single<SuraDao> { get<QuranDatabase>().SuraDao() }
//}
