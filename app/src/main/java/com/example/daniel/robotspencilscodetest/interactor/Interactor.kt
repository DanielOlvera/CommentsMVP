package com.example.daniel.robotspencilscodetest.interactor

import com.example.daniel.robotspencilscodetest.interactor.base.BaseInteractor
import com.example.daniel.robotspencilscodetest.model.Comments

/**
 * Created by Daniel on 4/19/17.
 */
interface Interactor : BaseInteractor{
    interface OnCommentListener {
        fun onSuccess(comment : Comments)
    }

    fun getComment(listener : OnCommentListener)
}