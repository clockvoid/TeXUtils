package com.lucciola

import com.lucciola.csvtotex.CSVToTexView
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.stage.Stage

class App : Application() {

    private lateinit var view: CSVToTexView
    private lateinit var root: BorderPane

    override fun start(primaryStage: Stage?) {
        root = BorderPane()
        view = CSVToTexView(root)
        view.start(primaryStage)
        primaryStage?.apply {
            title = "CSV to TeX Table"
            scene = Scene(root)
            show()
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(App::class.java, *args)
}
