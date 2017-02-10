package fanjh.mine.testmvp.splash.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;

import fanjh.mine.testmvp.base.BaseMvpActivity;
import fanjh.mine.testmvp.splash.presenter.SplashPresenter;
import fanjh.mine.testmvp.splash.ui.SplashView;

/**
 * Created by fanjh on 2017/2/9.
 */
public class SplashActivity extends BaseMvpActivity<SplashView,SplashPresenter>{
    @NonNull
    @Override
    public SplashPresenter createPresenter() {
        return new SplashPresenter(mContext);
    }

    @NonNull
    @Override
    public SplashView getContentView() {
        return new SplashView(mContext);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter.getSplashMessage();
        mPresenter.startCountDown();
    }

}
