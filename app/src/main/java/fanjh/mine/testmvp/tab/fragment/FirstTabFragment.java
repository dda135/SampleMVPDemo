package fanjh.mine.testmvp.tab.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.math.MathContext;

import fanjh.mine.testmvp.base.BaseMvpFragment;
import fanjh.mine.testmvp.tab.presenter.FirstTabPresenter;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class FirstTabFragment extends BaseMvpFragment<FirstTabLayout,FirstTabPresenter> {

    @Override
    public FirstTabLayout setupView() {
        return new FirstTabLayout(mContext);
    }

    @Override
    public FirstTabPresenter createPresenter() {
        return new FirstTabPresenter(mContext);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mPresenter.initNewsList(mView.getListView(), new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.getNews();
    }
}
