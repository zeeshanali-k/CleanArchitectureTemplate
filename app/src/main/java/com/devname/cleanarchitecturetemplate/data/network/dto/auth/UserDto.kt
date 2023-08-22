package com.devname.cleanarchitecturetemplate.data.network.dto.auth

import com.google.gson.annotations.SerializedName


data class UserDto(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
)