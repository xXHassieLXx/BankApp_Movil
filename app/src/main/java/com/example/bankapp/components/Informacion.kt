package com.example.bankapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.ui.theme.BankAppTheme

@Composable
fun Informacion() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Caja con fondo de color
        Box(
            modifier = Modifier
                .size(150.dp, 208.dp) // Tamaño ajustado para un mejor diseño
                .clip(RoundedCornerShape(12.dp)) // Bordes redondeados
                .background(Color(0xFFE3F2ED)), // Color de fondo
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Icono Persona
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Persona",
                    modifier = Modifier.size(30.dp),
                    tint = Color.Black
                )
                // Texto - Actividad
                Text(
                    text = "Actividad",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                // Texto - de la semana (más pequeño y gris)
                Text(
                    text = "de la semana",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
        }

        Spacer(modifier = Modifier.width(4.dp)) // Espacio entre las columnas

        Column {
            // Box de Ventas
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .size(150.dp, 100.dp)
                    .background(Color(0xFFF4E4D8)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Text - Ventas (Color gris, más pequeño)
                    Text(
                        text = "Ventas",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    // Text - $280.99 (Color Negro)
                    Text(
                        text = "$280.99",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp)) // Espacio entre Ventas y Ganancias

            // Box de Ganancias
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .size(150.dp, 100.dp)
                    .background(Color(0xFFE6E0F8)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Text - Ganancias (Color gris, más pequeño)
                    Text(
                        text = "Ganancias",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    // Text - $280.99 (Color Negro)
                    Text(
                        text = "$280.99",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }
        }
    }
}



@Preview(
    showBackground = true
)

@Composable
fun InformacionPreview() {
    BankAppTheme {
        Informacion()
    }
}