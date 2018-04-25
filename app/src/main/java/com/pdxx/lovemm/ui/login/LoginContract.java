package com.pdxx.lovemm.ui.login;

import com.pdxx.lovemm.ui.base.IView;

/**
 * Created by Administrator on 2018/4/25.
 */

public class LoginContract {
    interface IUserPresenter {
        void login();

        void register();
    }

    interface ILoginView extends IView {
        void showResult(String result);

        String getUsername();

        String getPassword();

    }
}
