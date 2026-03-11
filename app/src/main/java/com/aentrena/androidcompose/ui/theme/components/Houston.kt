package com.aentrena.androidcompose.ui.theme.components

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun HoustonScreen() {
    // var counter = remember { mutableStateOf(0) }
    var counter by rememberSaveable {  mutableStateOf(value = 0) }
    Button(onClick = {
        Log.d("Houston_antes", counter.toString())
        counter += 1
        Log.d("Houston_depues", counter.toString())
    }) {
        Text(text = counter.toString())
    }
}