package com.example.news_source

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.news_source.presentation.onboarding.OnBoardingScreen
import com.example.news_source.ui.theme.NewsSourceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            NewsSourceTheme(
                dynamicColor = false
            ){
                Box(modifier = Modifier.background(MaterialTheme.colorScheme.background))
                OnBoardingScreen()
            }
           // SplashScreen()
        }
    }
}

@Composable
fun SplashScreen(){
    val magenta = Color.Magenta
    val blue = Color.Blue
    val gradientmagentablue = Brush.verticalGradient(0f to magenta, 1000f to blue )
    Box(modifier = Modifier
        .fillMaxSize()
        .background(gradientmagentablue)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(painter = painterResource(id = R.drawable.icon_news), contentDescription = "App Icon",
                modifier = Modifier.size(96.dp))

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "News Source",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center)
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun PreviewSplashScreen(){
    SplashScreen()
}*/
