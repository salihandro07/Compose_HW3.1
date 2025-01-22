package com.example.compose_hw3.data.serviseLocator

import com.example.compose_hw3.BuildConfig
import com.example.compose_hw3.data.api.CharactersApiService
import com.example.compose_hw3.data.api.EpisodesApiService
import com.example.compose_hw3.data.api.LocationApiService
import com.example.compose_hw3.data.repository.CharactersRepository
import com.example.compose_hw3.data.repository.EpisodesRepository
import com.example.compose_hw3.data.repository.LocationsRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val dataModule = module {
    single { provideOkhttpClient() }
    single { provideRetrofit(get()) }

    single { get<Retrofit>().create(CharactersApiService::class.java) }
    single { get<Retrofit>().create(EpisodesApiService::class.java) }
    single { get<Retrofit>().create(LocationApiService::class.java) }

    single { CharactersRepository(get()) }
    single { EpisodesRepository(get()) }
    single { LocationsRepository(get()) }
}

fun provideOkhttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}
