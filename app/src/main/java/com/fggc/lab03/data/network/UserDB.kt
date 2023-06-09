package com.fggc.lab03.data.network

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fggc.lab03.domain.model.Reporte
import com.fggc.lab03.domain.model.User

@Database(entities = [User::class, Reporte::class], version = 1, exportSchema = false)
abstract  class UserDB: RoomDatabase() {
    abstract fun userDao(): UserDao
}