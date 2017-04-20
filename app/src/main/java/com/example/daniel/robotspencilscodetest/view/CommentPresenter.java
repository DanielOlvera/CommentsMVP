package com.example.daniel.robotspencilscodetest.view;

import com.example.daniel.robotspencilscodetest.data.CommentsRespository;

import rx.Observer;

/**
 * Created by Daniel on 2/8/17.
 */

public class CommentPresenter implements CommentContract.Presenter {

    private CommentsRespository dataRespository;
    private Observer<String> observer;
    private CommentContract.View view;

    public CommentPresenter() {
        observer = new Observer<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                view.showError(e.toString());
            }

            @Override
            public void onNext(String s) {
                view.showData(s);
            }
        };

        dataRespository = new CommentsRespository(observer);
    }

    @Override
    public void loadData() {
        dataRespository.generateData();
    }

    @Override
    public void attachView(CommentContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
