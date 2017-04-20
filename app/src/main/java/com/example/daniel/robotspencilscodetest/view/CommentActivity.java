package com.example.daniel.robotspencilscodetest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.daniel.robotspencilscodetest.R;

public class CommentActivity extends AppCompatActivity implements CommentContract.View{

    private CommentContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new CommentPresenter();
        presenter.attachView(this);
        presenter.loadData();
    }

    @Override
    public void showData(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showprogress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
