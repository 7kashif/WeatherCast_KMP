package com.kashif.weathercast_kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "WeatherCast_KMP",
    ) {
        App()
    }
}