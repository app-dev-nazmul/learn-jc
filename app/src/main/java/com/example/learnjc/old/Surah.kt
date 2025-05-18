//package com.example.learnjc.old
//
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//
//@Entity(tableName = "sura")
//data class Surah(
//    @PrimaryKey(autoGenerate = false)
//    val id: Int?, // <-- make it nullable if it's not NOT NULL in DB
//    val name: String?, // make nullable if not set to NOT NULL in DB
//    val name_ar: String? = null,
//    val name_en: String? = null,
//    val meaning_en: String? = null,
//    val meaning: String? = null,
//    val reverse_id: Int? = null,
//    val page_of_hafezi: Int? = null,
//    val pages: String? = null,
//    val ayat: String? = null,
//    val ayat_en: Int? = null,
//    val place: String? = null,
//    val place_en: String? = null,
//    val serial: String? = null
//)