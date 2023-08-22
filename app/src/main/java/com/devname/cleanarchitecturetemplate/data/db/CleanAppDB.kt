package com.devname.cleanarchitecturetemplate.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.devname.cleanarchitecturetemplate.data.db.dao.UsersDao
import com.devname.cleanarchitecturetemplate.data.network.dto.auth.UserDto


@Database(
    entities = [UserDto::class],
    version = 1, exportSchema = true
)
abstract class CleanAppDB : RoomDatabase() {
    abstract fun userDao(): UsersDao
}