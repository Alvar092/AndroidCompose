package com.aentrena.androidcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyIcon() {
    Column {
        Icon(painter = painterResource(id = R.drawable.ic_search), contentDescription = "Search", tint = Color.Green)
        Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
    }


}

@Preview
@Composable
private fun MyIcon_Preview() {
    MyIcon()
}

