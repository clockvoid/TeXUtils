package com.lucciola

import javafx.scene.Node
import javafx.stage.Stage

interface BaseView<T : BasePresenter> {

    val parent: Node

    fun start(primaryStage: Stage?)

    fun stop()

    fun end()

    fun setPresenter(presenter: T)
}