package com.example.bankapp.models


import android.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

data class MTransacciones(
    val id: Int,
    val title: String,
    val info: String,
    val pago: String,
    val hora: String,
)

val newsListMTransacciones = listOf(
    MTransacciones(
        id = 1,
        title = "Nike Store",
        info = "Ropa y Zapatos",
        pago = "-$27.67",
        hora = "2:23 PM"
    ),

    MTransacciones(
        id = 2,
        title = "Pepsi",
        info = "Restaurante y Cafe",
        pago = "-$34.92",
        hora = "10:00 PM"
    )

)