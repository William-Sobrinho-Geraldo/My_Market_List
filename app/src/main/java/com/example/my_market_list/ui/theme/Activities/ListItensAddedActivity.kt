package com.example.my_market_list.ui.theme.Activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.my_market_list.ui.theme.screens.ListItensAdded

class ListItensAddedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ListItensAdded()
        }
    }
}