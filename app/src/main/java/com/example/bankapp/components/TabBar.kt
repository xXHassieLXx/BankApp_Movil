package com.example.bankapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.utils.PersonCircle
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.colorspace.WhitePoint


@Composable
fun TabBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp).fillMaxWidth()

    ) {
        // Icono de usuario dentro de un círculo
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color(0xFFF4E4D8)), // Color de fondo del círculo
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = PersonCircle,
                contentDescription = null,
                modifier = Modifier.size(30.dp),
                tint = Color(0xFF1A1A1A)
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        // Información del usuario
        Column(
            modifier = androidx.compose.ui.Modifier.weight(1f) // Ocupa el espacio disponible y empuja el icono a la derecha
        ) {
            Text(
                text = "Hola, Hassi!",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Bienvenido de nuevo",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        // Icono de menú hamburguesa alineado a la derecha
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menú",
            modifier = Modifier.size(28.dp)
        )
    }
}



@Preview(
    showBackground = true
)
@Composable
fun TabBarPreview() {
    BankAppTheme {
        TabBar()
    }
}