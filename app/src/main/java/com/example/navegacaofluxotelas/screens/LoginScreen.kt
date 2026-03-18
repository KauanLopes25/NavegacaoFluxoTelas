package com.example.navegacaofluxotelas.screens

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@SuppressLint("RestrictedApi")
@Composable
fun LoginScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(32.dp)
    ) {
        Text(
            text = "LOGIN",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Button(
          onClick = {
              navController.navigate("menu")
          },
            colors = ButtonDefaults.buttonColors(
                Color.White
            ),
            modifier = Modifier
                .align(Alignment.Center)
        ) {
            Text(
                text = "ENTRAR",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Blue
            )
        }
    }
}