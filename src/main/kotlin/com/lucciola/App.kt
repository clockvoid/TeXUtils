package com.lucciola

import com.lucciola.csvtotex.CSVToTexView
import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.stage.Stage

class App : Application() {

    lateinit var view: CSVToTexView
    lateinit var root: Group

    override fun start(primaryStage: Stage?) {
        root = Group()
        primaryStage?.apply {
            title = "CSV to TeX Table"
            scene = Scene(root)
            show()
        }
        view = CSVToTexView(root)
        view.start(primaryStage)
    }
}

fun main(args: Array<String>) {
    Application.launch(App::class.java, *args)
}

