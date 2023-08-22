package com.devname.cleanarchitecturetemplate.domain.model


//Here error is generic type for maintaining localisation/internationalisation
//So set that to some sealed class/interface/enums etc and handle error strings on ui accordingly
sealed class DataResponse<T,E>(val data: T? = null, val error: E? = null) {
    class Success<T,E>(data: T?) : DataResponse<T,E>(data)
    class Error<T,E>(error: E) : DataResponse<T,E>(null, error)
    class Loading<T,E> : DataResponse<T,E>(null)
}