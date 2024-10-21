package com.example.pertemuan4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pertemuan4.R


@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier : Modifier = Modifier
){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HeaderSection()
        DetailMHS(
            param = "nama",
            argu = "salsa"
        )
        DetailMHS(
            param = "nim",
            argu = "20220140132"
        )
        DetailMHS(
            param = "prodi",
            argu = "teknologi informasi"
        )
        DetailMHS(
            param = "fakultas",
            argu = "teknik"
        )
        DetailMHS(
            param = "universitas",
            argu = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMHS(
            param = "alamat",
            argu = "bantul"
        )
        DetailMHS(
            param = "email",
            argu = "salsa@gmail.com"
        )
    }
}

@Composable

fun HeaderSection() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.LightGray)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = null,
                modifier = Modifier.clip(CircleShape)
            )
            Icon(
                Icons.Filled.Check,
                contentDescription = null,
                modifier=Modifier.size(30.dp)
            )
            Column(
                modifier = Modifier.padding(14.dp)
            ) {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DetailMHS( param:String, argu:String ){
    Column (modifier = Modifier.padding(16.dp))
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param, modifier = Modifier.weight(0.8f))
            Text(text = ": ", modifier = Modifier.weight(0.2f))
            Text(text = argu, modifier = Modifier.weight(2f))
        }
    }
}
