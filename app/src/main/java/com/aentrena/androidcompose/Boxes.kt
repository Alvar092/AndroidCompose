package com.aentrena.androidcompose

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun MyBox() {
    Box(modifier = Modifier
        .background(Color.Green)
        .size(100.dp)
    ) {
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red)
            .align(Alignment.Center)
        ) {
            Box(modifier = Modifier
                .size(20.dp)
                .background(Color.Blue)
                .align(Alignment.CenterEnd)
            )

            Box(modifier = Modifier
                .size(10.dp)
                .background(Color.White)
            )
        }
        Box(modifier = Modifier
            .background(Color.Black)
            .size(30.dp)
            .align(Alignment.BottomStart)
        )

        Box(modifier = Modifier
            .height(90.dp)
            .width(25.dp)
            .background(Color.LightGray)
            .align(Alignment.Center)
        )
    }
}

@Preview
@Composable
fun BoxExercise() {
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Green)) {


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .background(Color.Red)

        )

        Box(modifier = Modifier
            .align(Alignment.BottomStart)
            .width(30.dp)
            .height(30.dp)
            .background(Color.Black)
        )

        Box(modifier = Modifier
            .padding(10.dp)
            .align(Alignment.CenterEnd)
            .size(20.dp)
            .background(Color.Blue)
        )

        Box(modifier = Modifier
            .padding(10.dp)
            .align(Alignment.TopStart)
            .width(10.dp)
            .height(10.dp)
            .background(Color.White)
        )

        Box(modifier = Modifier
            .padding(5.dp)
            .align(Alignment.Center)
            .width(25.dp)
            .fillMaxHeight()
            .background(Color.LightGray)
        )
    }
}