package com.pdxx.lovemm.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.pdxx.lovemm.mvp.BasePresenter;
import com.pdxx.lovemm.mvp.IPresenter;

/**
 * view 和 presenter 互相注入就完事了
 */

public abstract class BasePresenterActivity<P extends IPresenter> extends BaseActivity {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        attachView();
    }

    public abstract P createPresenter();

    public void attachView() {
        if (presenter != null)
            presenter.attachView(this);
    }

    private void detachView() {
        if (presenter != null)
            presenter.detachView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        detachView();
    }

    @Override
    public void showSuccess() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showEmpty() {

    }
}
