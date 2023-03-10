package com.example.my_market_list.ui.theme.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(modifier: Modifier = Modifier,
    searchtext : String,
    onSearchChange: (String) -> Unit,
) {

    OutlinedTextField(modifier = modifier,
        value = searchtext,
        onValueChange = { newValue ->
            onSearchChange(newValue) },
        label = { Text(text = "Adicionar item") },
        shape = RoundedCornerShape(20.dp),
        placeholder = { Text(text = "O que você procura?") },

    )
}

var text: String by  mutableStateOf("")

@Preview (showSystemUi = true)
@Composable
fun SearchTextFielPreview() {
    SearchTextField(searchtext = "",onSearchChange = {
        text = it
    })
}


