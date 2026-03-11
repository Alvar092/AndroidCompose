package com.aentrena.androidcompose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun EjercicioLogin() {

    var valueUser by remember {
        mutableStateOf("")
    }
    var valuePass by remember {
        mutableStateOf("")
    }

    Box(Modifier.fillMaxSize().background(Color.White), Alignment.Center) {
        Column(
            Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomImage()
            Text(text = "Android Superpowers", style = MaterialTheme.typography.titleLarge)
            CustomTextField(
                "Ingrese su usuario",
                isPassword = false,
                icon = Icons.Filled.AccountBox,
                value = valueUser,
                onValueChange = {
                    valueUser = it
                }
            )

            CustomTextField(
                "Ingrese su contraseña",
                isPassword = true,
                icon = Icons.Filled.AccountBox,
                value = valuePass,

                onValueChange = {
                    valuePass = it
                }
            )

            Button(onClick = {
                //Correo tiene arroba y contraseña mas de 6 caracteres
                if (valueUser.contains("@") && valuePass.length > 6) {
                    Log.d("Hola", "Pass")
                } else {
                    Log.d("Hola", "Fail")

                }
            },
                ) {
                Text(text = "Iniciar sesion")
            }
        }
    }
}

@Composable
fun CustomTextField(placeholder: String, value: String, isPassword: Boolean, icon: ImageVector, onValueChange: (String)-> Unit) {

    TextField(
        value = value,
        onValueChange = {onValueChange(it)},
        label = {
        Text(text = placeholder)
        },
        leadingIcon =  { Icon(imageVector = icon, contentDescription = "Custom icon")},
        trailingIcon = { if(isPassword) Icon(imageVector = Icons.Filled.Lock, contentDescription = "Custom icon")},
        keyboardOptions = KeyboardOptions(
            keyboardType = if (isPassword) KeyboardType.Password else KeyboardType.Text,
            capitalization = KeyboardCapitalization.None
        ),
        )
}

@Composable
fun CustomImage() {
    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Image",
        Modifier
            .clip(CircleShape)
            .border(3.dp, Color.Black, CircleShape)
            .background(Color.Green)
    )
}



@Preview
@Composable
private fun EjercicioLogin_Preview() {
    EjercicioLogin()
}

