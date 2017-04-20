package com.example.daniel.robotspencilscodetest.data;


import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Daniel on 2/8/17.
 */

public class CommentsRespository {

    Observer<String> observer;

    public CommentsRespository(Observer<String> observer) {
        this.observer = observer;
    }

    public void generateData(){
        Observable.just("Sample data")
                .delay(2, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
