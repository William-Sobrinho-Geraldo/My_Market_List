package com.example.my_market_list.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(
    searchtext : String,
    onSearchChange: (String) -> Unit,
) {

    OutlinedTextField(
        value = searchtext,
        onValueChange = { newValue ->
            onSearchChange(newValue) },
        label = { Text(text = "Adicionar item") },
        shape = RoundedCornerShape(20.dp),
        placeholder = { Text(text = "O que você procura?") },

    )
}

//@Preview
//@Composable
//fun SearchTextFielPreview() {
//    SearchTextField("",)
//}


