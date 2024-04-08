package com.example.news_source.presentation.onboarding.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.news_source.R
import com.example.news_source.presentation.Dimens.MediumPadding1
import com.example.news_source.presentation.Dimens.MediumPadding2
import com.example.news_source.presentation.onboarding.Page
import com.example.news_source.ui.theme.NewsSourceTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page:Page
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(id = page.image), contentDescription = null,
            contentScale = ContentScale.Crop)
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(text = page.title, modifier = Modifier.padding(horizontal = MediumPadding2), style = MaterialTheme.typography.headlineMedium,
            color = colorResource(id = R.color.black))
        Text(text = page.description, modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.bodyMedium, color = colorResource(id = R.color.black))
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun OnBoardingPagePreview(){
    NewsSourceTheme {
        OnBoardingPage(page = Page(
            title = "Welcome to NewsSource",
            description = "Stay informed with the latest news from around the world. NewsSource delivers breaking news, trending stories, and in-depth analysis straight to your device.",
            image = R.drawable.onboarding_img2
        ))
    }
}