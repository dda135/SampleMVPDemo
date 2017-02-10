package fanjh.mine.testmvp.tab.fragment;

import fanjh.mine.testmvp.base.BaseMvpFragment;
import fanjh.mine.testmvp.tab.presenter.FirstTabPresenter;
import fanjh.mine.testmvp.tab.presenter.ThirdTabPresenter;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;
import fanjh.mine.testmvp.tab.ui.ThirdTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class ThirdTabFragment extends BaseMvpFragment<ThirdTabLayout,ThirdTabPresenter> {

    @Override
    public ThirdTabLayout setupView() {
        return new ThirdTabLayout(mContext);
    }

    @Override
    public ThirdTabPresenter createPresenter() {
        return new ThirdTabPresenter(mContext);
    }
}
