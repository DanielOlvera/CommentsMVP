package com.example.daniel.robotspencilscodetest

/**
 * Created by Daniel on 4/20/17.
 */
interface BasePresenter <V : BaseView>{
    fun attachView(view : V)
    fun detach()
    fun isAttached();
}