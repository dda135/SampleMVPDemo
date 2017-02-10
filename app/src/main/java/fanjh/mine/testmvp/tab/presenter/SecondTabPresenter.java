package fanjh.mine.testmvp.tab.presenter;

import android.content.Context;

import fanjh.mine.testmvp.base.BasePresenter;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;
import fanjh.mine.testmvp.tab.ui.SecondTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class SecondTabPresenter extends BasePresenter<SecondTabLayout>{
    private Context mContext;

    public SecondTabPresenter(Context mContext) {
        this.mContext = mContext;
    }
}
