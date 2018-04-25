package com.pdxx.lovemm.mvp;

import com.pdxx.lovemm.ui.base.IView;

/**
 * Created by Administrator on 2018/4/25.
 */

public interface IPresenter<V extends IView> {
    void attachView(V view);

    void detachView();

    void checkAttachView();

    V getView();


}
