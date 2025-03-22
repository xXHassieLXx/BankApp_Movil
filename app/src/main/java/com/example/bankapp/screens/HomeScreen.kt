package com.example.bankapp.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.components.Informacion
import com.example.bankapp.components.TabBar
import com.example.bankapp.components.Transacciones
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.models.newsListMTransacciones
import com.example.bankapp.models.MTransacciones



@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(5.dp)
    ) {
        TabBar()
        Informacion()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween // Separa los elementos a los extremos
        ) {
            Text(
                text = "Transacciones",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "See All",
                fontSize = 12.sp,
                fontWeight = FontWeight.Light
            )
        }

        LazyColumn {
            items(newsListMTransacciones){ transaccion ->
                Transacciones(MTransacciones = transaccion)
            }
        }
    }

}


@Preview(
    showBackground = true
)

@Composable
fun GreetingPreview() {
    BankAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}