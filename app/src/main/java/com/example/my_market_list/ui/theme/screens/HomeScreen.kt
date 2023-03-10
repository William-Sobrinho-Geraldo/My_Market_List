package com.example.my_market_list.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.my_market_list.R
import com.example.my_market_list.ui.theme.SampleData.sampleItens
import com.example.my_market_list.ui.theme.components.Item
import com.example.my_market_list.ui.theme.components.SearchTextField

@Composable
fun HomeScreen(searchText: String = "", onShoppingClick: () -> Unit = {}) {

    Column(Modifier.padding(16.dp)) {
        var text by remember { mutableStateOf(searchText) }
        val searchedItens = remember(text) {
            if (text.isNotBlank()) {
                sampleItens.filter { product ->
                    product.name.contains(
                        text,
                        ignoreCase = true,
                    )
                }
            } else emptyList()
        }

        Row(
            Modifier
                .fillMaxWidth()
                .height(85.dp)
                .padding(bottom = 16.dp)
        ) {
            //Campo de texto para buscar itens e compor a lista de compras

            SearchTextField(modifier = Modifier.fillMaxHeight(),
                searchtext = text,
                onSearchChange = {
                    text = it
                },
            )

            //Icone para consultar os itens adicionados na lista de compras
//            Button(onClick = onShoppingClick ) {
//
//            }


//            IconButton(onClick = onShoppingClick) {
//                painterResource(id = R.drawable.outline_shopping_cart_24)
//                Modifier
//                    .size(70.dp)
//                    .padding(start = 24.dp, top = 4.dp)
//            }

            FloatingActionButton(
                onClick = onShoppingClick,
                backgroundColor = Color.Gray,
                modifier = Modifier
                    .padding(start = 20.dp, top = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_shopping_cart_24),
                    contentDescription = null,
                    Modifier.background(Color.Gray)
                )
            }


//            Icon(
//                painter = painterResource(R.drawable.outline_shopping_cart_24),
//                contentDescription = "Icone de carrinho de compras",

//
//            )
        }
        //Spacer(modifier = Modifier.height(16.dp))

        //Grid de itens disponíveis para serem adicionados à lista de compras
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            content = {

                //Se o campo de texto não estiver vazio -> mostre a lista filtrada(searchedItens)
                if (text.isNotBlank()) {
                    items(searchedItens) {
                        Item(product = it)
                    }
                    //Caso contrário, mostre todos os itens (sampleItens)
                } else {
                    items(sampleItens.toList()) {
                        Item(
                            product = it
                        )
                    }
                }
            })
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
