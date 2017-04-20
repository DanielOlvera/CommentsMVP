package com.example.daniel.robotspencilscodetest.presenter.base

import com.example.daniel.robotspencilscodetest.view.CommentView
import com.example.daniel.robotspencilscodetest.view.base.BaseView

/**
 * Created by Daniel on 4/20/17.
 */
open class BasePresenterImp <V : CommentView> : BasePresenter<V>{
    protected var view: V? = null
    override fun attachView(view: V) {
        this.view = view
    }

    override fun dettachView() {
        this.view = null
    }
}