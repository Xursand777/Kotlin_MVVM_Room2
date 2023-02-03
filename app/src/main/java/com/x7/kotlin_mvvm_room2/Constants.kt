package com.x7.kotlin_mvvm_room2

import android.content.Context
import androidx.room.Room
import com.x7.kotlin_mvvm_room2.room.AppDatabase
import com.x7.kotlin_mvvm_room2.room.UserDao

object Constants {
    const val TABLE_NAMEE="mydatabasenew"
    lateinit var userDao: UserDao
    lateinit var MAINACTIVITY:MainActivity

    fun mydatabase(applicationContext: Context): AppDatabase {
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "$TABLE_NAMEE"
        ).allowMainThreadQueries().build()
        return db


    }
}