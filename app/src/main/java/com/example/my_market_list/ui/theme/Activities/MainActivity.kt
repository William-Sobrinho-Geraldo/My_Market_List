package com.example.my_market_list.ui.theme.Activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_market_list.ui.theme.My_Market_ListTheme
import com.example.my_market_list.ui.theme.screens.HomeScreen
import com.example.my_market_list.ui.theme.screens.ListItensAdded

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    My_Market_ListTheme {
        Surface {
            HomeScreen()
        }

    }
}

