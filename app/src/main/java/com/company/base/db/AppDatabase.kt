package com.company.base.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.company.base.db.dao.SomeDao
import com.company.base.db.models.SomeModel

@Database(
    entities = [SomeModel::class],
    version = 1,
    exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun someDao(): SomeDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {

                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "base.db")
                        .fallbackToDestructiveMigration() // Remove prior to launch
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}