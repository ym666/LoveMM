package com.pdxx.lovemm.ui.login;

import android.service.notification.NotificationListenerService;

import com.pdxx.lovemm.mvp.BasePresenter;

import java.util.Random;

/**
 * Created by Administrator on 2018/4/25.
 */

public class LoginPresenter extends BasePresenter<LoginContract.ILoginView> implements LoginContract.IUserPresenter {
    LoginModel model;
    LoginContract.ILoginView view;
    Random random = new Random();

    public LoginPresenter() {
        this.model = new LoginModel();
    }

    @Override
    public void login() {
        getAccount();
        view.showLoading();
        int random = this.random.nextInt(10);
        if (random > 5) {
            view.showResult("登录成功");
        } else {
            view.showResult("登录失败");
        }
    }

    @Override
    public void register() {
        getAccount();
        view.showLoading();
        int random = this.random.nextInt(10);
        if (random > 5) {
            view.showResult("注册成功");
        } else {
            view.showResult("注册失败");
        }
    }

    private void getAccount() {
        view = getView();
        String username = view.getUsername();
        String password = view.getPassword();
    }
}
