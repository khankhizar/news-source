package com.example.news_source.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.news_source.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to NewsSource",
        description = "Stay informed with the latest news from around the world. NewsSource delivers breaking news, trending stories, and in-depth analysis straight to your device.",
        image = R.drawable.onboarding_img2
    ),
    Page(
        title = "Personalized News Feed",
        description = "Tailor your news experience to your interests. Choose from a variety of categories such as politics, technology, sports, entertainment, and more. Receive customized news updates that matter most to you.",
        image = R.drawable.onboarding_image2
    ),
    Page(
        title = "Stay Updated Anywhere, Anytime",
        description = "With NewsSource, you're always in the know. Receive instant notifications for breaking news and major events. Whether you're at home, work, or on the go, access the latest news whenever you need it.",
        image = R.drawable.onboarding_img2
    )
)