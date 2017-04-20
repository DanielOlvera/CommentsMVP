package com.example.daniel.robotspencilscodetest;

/**
 * Created by Daniel on 2/8/17.
 */

public interface BasePresenter<V> {
    void attachView(V view);
    void detachView();
}
