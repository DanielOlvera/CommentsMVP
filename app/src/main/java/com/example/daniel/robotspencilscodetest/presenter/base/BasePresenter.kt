package com.example.daniel.robotspencilscodetest.presenter.base

/**
 * Created by Daniel on 4/19/17.
 */
interface BasePresenter <in V> {
    fun attachView(view: V)
    fun dettachView()
}