package com.devname.cleanarchitecturetemplate.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.devname.cleanarchitecturetemplate.data.network.dto.auth.UserDto


@Dao
interface UsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users: List<UserDto>)

    @Query("SELECT * FROM users")
    suspend fun getAll() : List<UserDto> //You can also return flow or livedata


}