package fanjh.mine.testmvp.tab.fragment;

import fanjh.mine.testmvp.base.BaseMvpFragment;
import fanjh.mine.testmvp.tab.presenter.FirstTabPresenter;
import fanjh.mine.testmvp.tab.presenter.FourTabPresenter;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;
import fanjh.mine.testmvp.tab.ui.FourTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class FourTabFragment extends BaseMvpFragment<FourTabLayout,FourTabPresenter> {

    @Override
    public FourTabLayout setupView() {
        return new FourTabLayout(mContext);
    }

    @Override
    public FourTabPresenter createPresenter() {
        return new FourTabPresenter(mContext);
    }
}
