package com.example.daniel.robotspencilscodetest.view

import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.LayoutRes
import android.support.annotation.Nullable
import android.support.v7.app.AppCompatActivity
import com.example.daniel.robotspencilscodetest.BaseView

/**
 * Created by Daniel on 4/20/17.
 */
abstract class BaseActivity : AppCompatActivity(), BaseView{

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentResource())
        init(savedInstanceState!!)

    }

    @LayoutRes
    protected abstract fun getContentResource(): Int

    protected abstract fun init(@Nullable state: Bundle)

}