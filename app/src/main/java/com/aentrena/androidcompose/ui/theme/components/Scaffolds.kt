package com.aentrena.androidcompose.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyScaffold() {
    Scaffold (
        topBar = {
            MyTopBar()
    },
        floatingActionButton = {
            Icon(imageVector = Icons.Default.Add, contentDescription = "add")
        }
    ) {
        Box(Modifier
            .fillMaxSize()
            .background(Color.Green)
            .padding(it)) {

        }
    }
}

@Composable
fun CustomTopBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "back")
        Text("Mi Scaffold")
        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "dropdown")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar() {
    CenterAlignedTopAppBar(title = { Text("Mi topbar")},
        navigationIcon = { Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "back")}
    )
}

@Preview
@Composable
private fun MyTopBar_Preview() {
    MyTopBar()
}

@Preview
@Composable
private fun MyScaffold_Preview() {
    MyScaffold()
}

