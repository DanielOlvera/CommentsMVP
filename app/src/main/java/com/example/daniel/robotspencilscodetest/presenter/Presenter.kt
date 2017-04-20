package com.example.daniel.robotspencilscodetest.presenter

import android.view.View
import com.example.daniel.robotspencilscodetest.presenter.base.BasePresenter

/**
 * Created by Daniel on 4/20/17.
 */
interface Presenter : BasePresenter<View>{
    fun getComment();
}