package com.example.daniel.robotspencilscodetest.view

import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.daniel.robotspencilscodetest.R
import com.example.daniel.robotspencilscodetest.presenter.CommentPresenter

class CommentActivity : BaseActivity(), CommentContract.View, View.OnClickListener {

    private var editTextName : EditText ?= null
    private var editTextComment : EditText ?= null
    private var cPresenter : CommentPresenter ?= null

    override fun onTextLoaded(text: String) {
        editTextName!!.text
    }

    override fun getContentResource(): Int {
        return R.layout.activity_main
    }

    override fun init(state: Bundle) {
        editTextName!!.findViewById(R.id.name)
        editTextComment!!.findViewById(R.id.comment)
        cPresenter = CommentPresenter()
        cPresenter!!.attachView(this)
        cPresenter!!.loadComments()
    }

    override fun onClick(p0: View?) {
        cPresenter!!.pushToFirebase()
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//    }

    override fun onDestroy() {
        super.onDestroy()
        cPresenter!!.detach()
    }
}
