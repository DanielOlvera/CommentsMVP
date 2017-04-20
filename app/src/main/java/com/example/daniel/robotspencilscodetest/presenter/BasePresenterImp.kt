package com.example.daniel.robotspencilscodetest.presenter

import com.example.daniel.robotspencilscodetest.BasePresenter
import com.example.daniel.robotspencilscodetest.BaseView

/**
 * Created by Daniel on 4/20/17.
 */
class BasePresenterImp <V : BaseView> : BasePresenter<V>{

    private var mView : V ?= null

    override fun attachView(view: V) {
        this.mView = view
    }

    override fun detach() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isAttached() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getView() : V{
        return mView!!
    }
}