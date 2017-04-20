package com.example.daniel.robotspencilscodetest.view

import com.example.daniel.robotspencilscodetest.model.Comments
import com.example.daniel.robotspencilscodetest.view.base.BaseView

/**
 * Created by Daniel on 4/20/17.
 */
interface CommentView : BaseView{
    fun showMessage(comment : Comments)
}