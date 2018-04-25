package com.pdxx.lovemm.mvp;

import com.pdxx.lovemm.ui.base.BaseActivity;
import com.pdxx.lovemm.ui.base.BasePresenterActivity;
import com.pdxx.lovemm.ui.base.IView;

import javax.crypto.spec.IvParameterSpec;

/**
 * Created by Administrator on 2018/4/25.
 */

public class BasePresenter<V extends IView> implements IPresenter<V> {

    private V view;

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void checkAttachView() {
        if (view==null)
            throw new RuntimeException("you have no binding view");
    }

    @Override
    public V getView() {
        checkAttachView();
        return view;
    }
}
