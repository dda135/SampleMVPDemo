package fanjh.mine.testmvp.tab.fragment;

import fanjh.mine.testmvp.base.BaseMvpFragment;
import fanjh.mine.testmvp.tab.presenter.FirstTabPresenter;
import fanjh.mine.testmvp.tab.presenter.SecondTabPresenter;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;
import fanjh.mine.testmvp.tab.ui.SecondTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class SecondTabFragment extends BaseMvpFragment<SecondTabLayout,SecondTabPresenter> {

    @Override
    public SecondTabLayout setupView() {
        return new SecondTabLayout(mContext);
    }

    @Override
    public SecondTabPresenter createPresenter() {
        return new SecondTabPresenter(mContext);
    }
}
