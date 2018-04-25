package com.pdxx.lovemm.ui.login;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pdxx.lovemm.R;
import com.pdxx.lovemm.mvp.IPresenter;
import com.pdxx.lovemm.ui.base.BasePresenterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/4/25.
 */

public class LoginActivity extends BasePresenterActivity<LoginPresenter> implements LoginContract.ILoginView {
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.text_input_username)
    TextInputLayout textInputUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.text_input_password)
    TextInputLayout textInputPassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.bt_register)
    Button btRegister;

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }


    @OnClick({R.id.bt_login, R.id.bt_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                presenter.login();
                break;
            case R.id.bt_register:
                presenter.register();
                break;
        }
    }

    @Override
    public void showResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getTitlebarTitle() {
        return "登录";
    }
}
