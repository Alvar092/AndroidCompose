package com.aentrena.androidcompose

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Composable
fun MyColumn(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        BoxExercise() 
        BoxExercise()
        BoxExercise()
        BoxExercise()
    }
}

@Preview(showBackground = true)
@Composable
private fun MyColumn_Preview() {
    MyColumn()
}

@Composable
fun MyRow(modifier: Modifier = Modifier) {
    Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceEvenly ) {
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red))
    }
}

@Preview
@Composable
private fun MyRow_Preview() {
    MyRow()
}

@Composable
fun MyRow2(modifier: Modifier = Modifier) {
    Row(Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .height(100.dp)
            .weight(2f)
            .background(Color.Blue))
        Box(modifier = Modifier
            .height(100.dp)
            .weight(1f)
            .background(Color.Red))
        Box(modifier = Modifier
            .height(100.dp)
            .weight(3f)
            .background(Color.Yellow))
    }
}

@Preview
@Composable
private fun MyRow2_Preview() {
    MyRow2()
}

@Composable
fun RowColumnEx(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
        , verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        Row(Modifier
            .height(120.dp)
            .fillMaxWidth()
            , horizontalArrangement = Arrangement.End
        ) {
            Box(Modifier
                    .size(40.dp)
                    .background(Color.Blue)
                    .align(Alignment.CenterVertically)
            )

            Box(Modifier
                    .size(80.dp)
                    .background(Color.Red)
                    .align(Alignment.CenterVertically)
            )

            Box(Modifier
                    .height(120.dp)
                    .width(120.dp)
                    .background(Color.Yellow)
                    .align(Alignment.CenterVertically)
            )
        }

        Row (Modifier.fillMaxWidth(), Arrangement.End) {
            Column(horizontalAlignment = Alignment.End) {
                Box(Modifier
                    .size(40.dp)
                    .background(Color.Blue)
                )

                Box(Modifier
                    .size(90.dp)
                    .background(Color.Red)
                )

                Box(Modifier
                    .size(120.dp)
                    .background(Color.Yellow)
                )
            }
        }

        Row(Modifier.fillMaxWidth(),Arrangement.Center) {
            Box(Modifier
                .size(40.dp)
                .background(Color.Black)
            )

            Box(Modifier
                .size(40.dp)
                .background(Color.Gray)
            )

            Box(Modifier
                .size(40.dp)
                .background(Color.Blue)
            )
        }

        Row(Modifier.fillMaxWidth(), Arrangement.SpaceEvenly) {
            Box(Modifier
                .height(40.dp)
                .weight(1f)
                .background(Color.Green)
            )

            Box(Modifier
                .height(40.dp)
                .weight(1f)
                .background(Color.Cyan)
            )

            Box(Modifier
                .height(40.dp)
                .weight(1f)
                .background(Color.Magenta)
            )
        }

        Row (Modifier.fillMaxWidth(),Arrangement.SpaceEvenly){
            Column {
                Row(Modifier.weight(1f)) {
                    Box(Modifier
                        .height(40.dp)
                        .weight(1.5f)
                        .background(Color.Blue)
                    )
                    Box(Modifier
                        .height(40.dp)
                        .weight(1f)
                        .background(Color.White)
                    )
                    Box(Modifier
                        .height(40.dp)
                        .weight(1f)
                        .background(Color.Red)
                    )
                    Box(Modifier
                        .height(40.dp)
                        .weight(1f)
                        .background(Color.Yellow)
                    )
                }

                Row(Modifier.weight(1f)) {

                }

                Row(Modifier.weight(1f)) {

                }
            }

            Column {
                Row (Modifier.fillMaxWidth(),Arrangement.SpaceEvenly) {
                    Box(Modifier
                        .height(40.dp)
                        .weight(1f)
                        .background(Color.Cyan)
                    )

                    Column (Modifier
                        .fillMaxWidth()
                        .weight(1f)

                    ) {
                        Box(Modifier
                            .background(Color.Blue)
                            .size(40.dp)
                        )
                        Box(Modifier
                            .background(Color.Red)
                            .size(40.dp)
                        )
                        Box(Modifier
                            .background(Color.Yellow)
                            .size(40.dp)
                        )
                    }
                }

            }
        }

    }
}

@Preview
@Composable
private fun RowColumnEx_Preview() {
    RowColumnEx()
}