package com.example.my_market_list.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_market_list.ui.theme.model.ItemProductClass

@Composable
fun Item(
    product: ItemProductClass,

) {
    Box(
        Modifier.fillMaxWidth()
            .height(55.dp)
    ) {
        Row(
            Modifier
                .background(Color.Gray)
                .fillMaxSize()
        ) {
            Icon(
                modifier = Modifier.padding(start = 6.dp, top = 6.dp),
                imageVector = Icons.Default.Add,
                contentDescription = "icone de adicionar",
            )
            Text(
                text = product.name,
                Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 4.dp,
                        top = 26.dp,
                        end = 16.dp,
                        bottom = 6.dp
                    ),
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
            )
        }
    }
}

@Preview
@Composable
fun ItemPreview() {
    Item(ItemProductClass("Produto 1"))
}