package com.devname.cleanarchitecturetemplate.di

import android.content.Context
import androidx.room.Room
import com.devname.cleanarchitecturetemplate.BuildConfig
import com.devname.cleanarchitecturetemplate.data.db.CleanAppDB
import com.devname.cleanarchitecturetemplate.data.network.AuthClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {


    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val client: OkHttpClient = OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .addNetworkInterceptor(httpLoggingInterceptor)
            .retryOnConnectionFailure(true)
            //For setting default query parameters with all requests
            .addInterceptor(Interceptor { chain: Interceptor.Chain ->
                val builder = chain.request()
                    .newBuilder()
                    .addHeader("Accept", "application/json")
                    .addHeader("Content-Type", "application/json")
                chain.proceed(
                    builder.url(
                        chain.request().url
                            .newBuilder()
                    //TODO: Remove if not needed
                            //.addQueryParameter("param_name", "value")
                            .build()
                    )
                        .build()
                )
            })
            .build()
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)//TODO: Update in gradle.properties
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideAuthClient(retrofit: Retrofit): AuthClient {
        return retrofit.create(AuthClient::class.java)
    }

    @Singleton
    @Provides
    fun provideRoomDB(@ApplicationContext context: Context): CleanAppDB {
        return Room.databaseBuilder(
            context,
            CleanAppDB::class.java,
            "clean_app.db"//TODO: Change db name
        ).build()
    }

}