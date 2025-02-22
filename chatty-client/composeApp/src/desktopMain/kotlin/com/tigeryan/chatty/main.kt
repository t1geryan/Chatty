package com.tigeryan.chatty

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "chatty-client",
    ) {
        App()
    }
}