package com.devname.cleanarchitecturetemplate.data.network.dto.auth

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "users")
data class UserDto(
    @PrimaryKey(autoGenerate = false)//TODO: set according to your use case
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
)