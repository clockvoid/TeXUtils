package com.lucciola

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Main : Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage?.title = "Hello World!"
        val btn = Button().apply {
            text = "Say Hello World"
            onAction = javafx.event.EventHandler<ActionEvent> {
                println("Hello, world")
            }
        }
        val root = StackPane().apply {
            children.add(btn)
        }
        primaryStage?.scene = Scene(root, 300.0, 250.0)
        primaryStage?.show()
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}

