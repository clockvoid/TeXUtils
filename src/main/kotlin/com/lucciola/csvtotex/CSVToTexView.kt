package com.lucciola.csvtotex

import javafx.fxml.FXMLLoader
import javafx.stage.Stage
import javafx.application.Platform
import javafx.scene.Group

class CSVToTexView(override val parent: Group) : CSVToTexContract.View {

    override fun start(primaryStage: Stage?) {
        val fxmlLoader = FXMLLoader(this::class.java.classLoader.getResource("csv_to_tex.fxml"))
        this.parent.children.add(fxmlLoader.load())
        Platform.setImplicitExit(true)
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun end() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPresenter(presenter: CSVToTexContract.Presenter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showTexTable() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showCSV() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copyToClipboard() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
