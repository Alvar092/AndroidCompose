package com.aentrena.androidcompose.ui.theme.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aentrena.androidcompose.R

@Composable
fun MyCard() {

    Box {
        Card(colors = CardDefaults.cardColors(containerColor = Color.Blue),
            elevation = CardDefaults.cardElevation(pressedElevation = 10.dp),
            border = BorderStroke(5.dp, Color.Green)
        ) {
            Row {
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "imagen")
                Text("Mi imagen")
            }
        }
    }
    }



@Preview(showSystemUi = true)
@Composable
private fun MyCard_Preview() {
    MyCard()
}

