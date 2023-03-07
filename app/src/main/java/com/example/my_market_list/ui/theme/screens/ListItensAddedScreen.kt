package com.example.my_market_list.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_market_list.ui.theme.SampleData.sampleItensAdded
import com.example.my_market_list.ui.theme.components.Item

@Composable
fun ListItensAdded() {
    Column(Modifier.padding(16.dp).fillMaxWidth()) {
        Text(
            text = "Itens adicionados",
            fontWeight = FontWeight(500),
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
        )
        LazyColumn(
            content = {
                items(sampleItensAdded.toList()) {
                    Item(product = it)
                }
            },
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
            ) //LazyColumn
    }

}

@Preview(showSystemUi = true)
@Composable
fun ListItensAddedPreview() {
    ListItensAdded()
}

