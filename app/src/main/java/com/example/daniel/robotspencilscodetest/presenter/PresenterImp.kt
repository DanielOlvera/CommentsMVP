package com.example.daniel.robotspencilscodetest.presenter

import android.view.View
import com.example.daniel.robotspencilscodetest.interactor.Interactor
import com.example.daniel.robotspencilscodetest.model.Comments
import com.example.daniel.robotspencilscodetest.presenter.base.BasePresenterImp
import com.example.daniel.robotspencilscodetest.view.CommentView

/**
 * Created by Daniel on 4/19/17.
 */
class PresenterImp (private val interactor: Interactor) : BasePresenterImp<CommentView>(),
        Presenter, Interactor.OnCommentListener{
    override fun dettachView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attachView(view: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getComment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSuccess(comment: Comments) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}