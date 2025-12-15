package com.aentrena.androidcompose

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyTextField() {
    var text = "Alvaro"
    TextField(
        value = text,
        onValueChange = { text = it },
        leadingIcon = {
            MyIcon()
        },
        trailingIcon = {
            MyIcon()
        },
        placeholder = {
            Text("Placeholder", modifier = Modifier.alpha(0.5f))
        },
        label = {
            Text("First name")
        },
        maxLines = 2,
        singleLine = true
    )
}

@Preview
@Composable
private fun MyTextField_Preview() {
    MyTextField()
}

