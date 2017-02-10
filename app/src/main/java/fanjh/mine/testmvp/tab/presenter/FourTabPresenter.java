package fanjh.mine.testmvp.tab.presenter;

import android.content.Context;

import fanjh.mine.testmvp.base.BasePresenter;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;
import fanjh.mine.testmvp.tab.ui.FourTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class FourTabPresenter extends BasePresenter<FourTabLayout>{
    private Context mContext;

    public FourTabPresenter(Context mContext) {
        this.mContext = mContext;
    }
}
