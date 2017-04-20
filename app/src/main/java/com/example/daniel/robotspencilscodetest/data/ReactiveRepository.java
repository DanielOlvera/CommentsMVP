package com.example.daniel.robotspencilscodetest.data;

import rx.Observable;
import rx.Observer;

/**
 * Created by Daniel on 2/9/17.
 */

public class ReactiveRepository {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(5);
        Observable<Integer> observable2 = Observable.just(9);

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("onNext");
                System.out.println(integer);
            }
        };

        observable.subscribe(observer);
        observable2.subscribe(observer);

        for (int i = 0; i < 10; i++) {
            observable.subscribe(observer);
        }
    }
}
