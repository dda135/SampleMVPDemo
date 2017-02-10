package fanjh.mine.testmvp.tab.presenter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

import fanjh.mine.testmvp.R;
import fanjh.mine.testmvp.base.BasePresenter;
import fanjh.mine.testmvp.tab.adapter.TabPagerAdapter;
import fanjh.mine.testmvp.tab.fragment.FirstTabFragment;
import fanjh.mine.testmvp.tab.fragment.FourTabFragment;
import fanjh.mine.testmvp.tab.fragment.SecondTabFragment;
import fanjh.mine.testmvp.tab.fragment.ThirdTabFragment;
import fanjh.mine.testmvp.tab.ui.TabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class TabPresenter extends BasePresenter<TabLayout>{
    private Context mContext;

    public TabPresenter(Context mContext) {
        this.mContext = mContext;
    }

    public void setTabSelected(int position){
        mView.setTabSelected(position);
    }

    public void setupPager(FragmentManager fm){
        TabPagerAdapter adapter = new TabPagerAdapter(fm);
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new FirstTabFragment());
        fragmentList.add(new SecondTabFragment());
        fragmentList.add(new ThirdTabFragment());
        fragmentList.add(new FourTabFragment());
        adapter.addFragments(fragmentList);
        mView.setPagerAdapter(adapter);
    }

    public void setupTab(){
        mView.setupTab(0,R.mipmap.ic_launcher,"tag1");
        mView.setupTab(1,R.mipmap.ic_launcher,"tag2");
        mView.setupTab(2,R.mipmap.ic_launcher,"tag3");
        mView.setupTab(3,R.mipmap.ic_launcher,"tag4");
        mView.setTabScrollChanged();
    }

}
