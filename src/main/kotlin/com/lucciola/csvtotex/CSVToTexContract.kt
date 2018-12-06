package com.lucciola.csvtotex

import com.lucciola.BasePresenter
import com.lucciola.BaseView

interface CSVToTexContract {

    interface View : BaseView<Presenter> {

        fun showTexTable()

        fun showCSV()

        fun copyToClipboard()
    }

    interface Presenter : BasePresenter {

        fun parseCSV()

        fun parseTexTable()

        fun copyToClipboard()
    }
}