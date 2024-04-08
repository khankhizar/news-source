package com.example.news_source.domain.useCases

import com.example.news_source.domain.packageManager.LocalUserManager

class SaveAppEntry(private val localUserManager: LocalUserManager) {

    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}