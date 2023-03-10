package com.example.my_market_list.ui.theme.Activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.my_market_list.ui.theme.My_Market_ListTheme
import com.example.my_market_list.ui.theme.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(HomeScreen(onShoppingClick = {
                startActivity(Intent(
                    this,
                    ListItensAddedActivity::class.java
                ))
            }))
        }
    }
}

@Composable
fun App(screen: Unit) {
    My_Market_ListTheme {
        Surface {
            screen
        }

    }
}

