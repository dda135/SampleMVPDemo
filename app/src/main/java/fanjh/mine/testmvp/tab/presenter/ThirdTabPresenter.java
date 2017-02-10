package fanjh.mine.testmvp.tab.presenter;

import android.content.Context;

import fanjh.mine.testmvp.base.BasePresenter;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;
import fanjh.mine.testmvp.tab.ui.ThirdTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class ThirdTabPresenter extends BasePresenter<ThirdTabLayout>{
    private Context mContext;

    public ThirdTabPresenter(Context mContext) {
        this.mContext = mContext;
    }
}
