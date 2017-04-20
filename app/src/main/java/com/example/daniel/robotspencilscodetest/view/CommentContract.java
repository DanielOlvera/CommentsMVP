package com.example.daniel.robotspencilscodetest.view;

import com.example.daniel.robotspencilscodetest.*;


/**
 * Created by Daniel on 2/8/17.
 */

public interface CommentContract {
    interface View extends BaseView{
        void showData(String data);
    }

    interface Presenter extends BasePresenter<View>{
        void loadData();
    }
}
