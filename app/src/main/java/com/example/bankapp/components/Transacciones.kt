package com.example.bankapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.bankapp.models.newsListMTransacciones
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.models.MTransacciones
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.utils.Shopping_cart


@Composable
fun Transacciones(MTransacciones : MTransacciones) {
    Column {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)  // Tamaño del icono
                        .clip(CircleShape)  // Hacerlo circular
                        .background(Color.Black),  // Color negro de fondo
                    contentAlignment = Alignment.Center


                ) {
                    androidx.compose.material3.Icon(
                        imageVector = Shopping_cart,
                        contentDescription = null,
                        modifier = Modifier.size(25.dp),
                        tint = Color(0xFFF8F9FA)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = MTransacciones.title,
                        color = Color.Black, // Título en color negro
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = MTransacciones.info,
                        color = Color.Gray, // Información en color gris
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold

                    )
                }

                Spacer(modifier = Modifier.weight(0.5f))

                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        text = MTransacciones.pago,
                        color = Color.Black, // Pago en color negro
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = MTransacciones.hora,
                        color = Color.Gray, // Hora en color gris
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

    }
}



@Preview(
    showBackground = true
)

@Composable
fun TransaccionesPreview() {
    BankAppTheme {
        Transacciones(
            MTransacciones = newsListMTransacciones[0]
        )
    }
}
