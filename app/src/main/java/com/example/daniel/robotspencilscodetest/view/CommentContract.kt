package com.example.daniel.robotspencilscodetest.view

import com.example.daniel.robotspencilscodetest.BasePresenter
import com.example.daniel.robotspencilscodetest.BaseView

/**
 * Created by Daniel on 4/20/17.
 */
interface CommentContract {

    //User action
    interface Presenter : BasePresenter<CommentContract.View> {
        fun loadComments()
        fun pushToFirebase();
    }

    //Action callback
    interface View : BaseView {
        fun onTextLoaded(text : String)
    }
}