package com.aentrena.androidcompose

import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MyText(modifier: Modifier = Modifier) {
    Text(text = "Hola Android", fontSize = 20.sp, color = Color.Blue, modifier = Modifier.background(Color.Red))
}

@Preview
@Composable
fun MyTextStyle() {
    Text(text = "Hola Android", style = MaterialTheme.typography.titleLarge.copy(color = Color.Red))
}

@Composable
private fun Header(text: String) {
    Text(text = text, style = MaterialTheme.typography.bodyMedium)
}

@Preview
@Composable
private fun Header_Preview() {
    Header("Superheroes")
}

@Preview
@Composable
private fun HeaderFav() {
    Text(text = "Favoritos", style = MaterialTheme.typography.bodyMedium)
}

@Preview
@Composable
private fun MyText_Preview() {
    MyText()
}





