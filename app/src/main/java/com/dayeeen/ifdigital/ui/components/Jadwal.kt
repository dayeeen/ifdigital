package com.dayeeen.ifdigital.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dayeeen.ifdigital.R

@Composable
fun Jadwal(
    modifier: Modifier = Modifier
){
    Box() {
        // Card untuk detail mata kuliah
        Card(
            shape = RoundedCornerShape(12.dp),
            modifier = modifier
                .padding(top = 50.dp, start = 16.dp)  // Memindahkan card ini ke bawah
                .width(290.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = "Pemrosesan Bahasa Alami",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    fontSize = 12.sp,
                )
                Text(
                    text = "12:40 - 15.10",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    fontSize = 12.sp
                )
                Text(
                    text = "Gedung FST - R. 4.01",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    fontSize = 12.sp
                )
            }
        }

        // Spacer untuk memindahkan Card ke bawah
        Spacer(modifier = Modifier.height(80.dp)) // Menambah spasi di antara dua card

        // Card untuk judul jadwal kuliah
        Card(
            modifier = modifier
                .width(178.dp)
                .padding(16.dp)
            ,
            shape = RoundedCornerShape(topStart = 12.dp, topEnd = 36.dp, bottomStart = 0.dp, bottomEnd = 36.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Yellow)  // Set background color to yellow
        ) {
            Column(
                Modifier
                    .padding(5.dp)
            ) {
                Text(
                    text = "Jadwal Kuliah hari ini",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    fontSize = 12.sp,
                )
                Text(
                    text = "Rabu, 02 Oktober 2024",
                    fontSize = 12.sp
                )
            }
        }
    }
}


@Preview
@Composable
fun JadwalPreview() {
    Jadwal()
}