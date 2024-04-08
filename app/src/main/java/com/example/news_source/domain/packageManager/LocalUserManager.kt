package com.example.news_source.domain.packageManager

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {

    suspend fun saveAppEntry()

    fun readAppEntry() : Flow<Boolean>
}