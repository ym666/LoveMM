package com.pdxx.lovemm.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import com.pdxx.lovemm.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/4/25.
 */

public abstract class BaseActivity extends AppCompatActivity implements IView {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private Unbinder bind;
    private FrameLayout fl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initview();
        bind = ButterKnife.bind(this);
        setToolbar(getTitlebarTitle(), isNeedTitle());
    }

    private void initview() {
        fl = findViewById(R.id.fl);
        View subView = getLayoutInflater().inflate(getLayoutId(), fl, false);
        fl.addView(subView);
    }

    public void setToolbar(String title, boolean isNeed) {
        if (isNeed) {
            toolbar.setTitle(title);
            setSupportActionBar(toolbar);
        } else {
            toolbar.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    public abstract int getLayoutId();


    public String getTitlebarTitle() {
        return "";
    }

    public boolean isNeedTitle() {
        return true;
    }
}
