package fanjh.mine.testmvp.tab.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import fanjh.mine.testmvp.base.BaseMvpActivity;
import fanjh.mine.testmvp.tab.fragment.FirstTabFragment;
import fanjh.mine.testmvp.tab.presenter.TabPresenter;
import fanjh.mine.testmvp.tab.ui.TabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class TabActivity extends BaseMvpActivity<TabLayout,TabPresenter>{
    @NonNull
    @Override
    public TabPresenter createPresenter() {
        return new TabPresenter(mContext);
    }

    @NonNull
    @Override
    public TabLayout getContentView() {
        return new TabLayout(mContext);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPager();
        mPresenter.setupTab();
    }

    private void setPager(){
        mPresenter.setupPager(getSupportFragmentManager());
    }

}
