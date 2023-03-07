package com.example.my_market_list.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewItemScreen() {
    Column(
        Modifier
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {

        Text(
            text = "Criando um novo item",
            fontSize = 26.sp,
            fontWeight = FontWeight(500),
            modifier = Modifier.fillMaxWidth(),
        )
//Nome do item
        var name by remember { mutableStateOf("") }
        TextField(
            value = name,
            onValueChange = {
                name = it
            },
            Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            label = { Text(text = "Nome do item") },
        )
//Preço do item
        var price by remember { mutableStateOf("") }
        TextField(
            value = price,
            onValueChange = {
                price = it
            },
            Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            label = { Text(text = "Preço") },
        )

    }

}

@Preview(showSystemUi = true)
@Composable
fun NewItemScreenPreview() {
    NewItemScreen()
}