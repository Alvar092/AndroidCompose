package com.aentrena.androidcompose


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyButton1() {
    Button(onClick = { /*TODO*/}) {
        Text("Click me!")
        Spacer(Modifier.width(10.dp))
        Text("Please")
    }
}

@Composable
fun MyButton(enabled: Boolean) {
    Button(
        onClick = { /*TODO*/ },
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black,
            contentColor = Color.Cyan,
            disabledContainerColor = Color.Yellow,
            disabledContentColor = Color.LightGray
        ),
        border = if (enabled) BorderStroke(3.dp, Color.Red) else BorderStroke(3.dp, Color.Black)
    )
        {
            Text("Click me!")
        }
}

@Preview
@Composable
private fun MyButton_Preview() {
    MyButton(true)
}

@Preview
@Composable
private fun MyButton_Disabled_Preview() {
    MyButton(false)
}