package fanjh.mine.testmvp.tab.presenter;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.LinkedList;

import fanjh.mine.testmvp.api.utils.callback.OnMessageCallback;
import fanjh.mine.testmvp.api.utils.hint.ToastHelper;
import fanjh.mine.testmvp.base.BasePresenter;
import fanjh.mine.testmvp.tab.adapter.NewsAdapter;
import fanjh.mine.testmvp.tab.model.News;
import fanjh.mine.testmvp.tab.model.NewsModel;
import fanjh.mine.testmvp.tab.ui.FirstTabLayout;

/**
 * Created by fanjh on 2017/2/9.
 */
public class FirstTabPresenter extends BasePresenter<FirstTabLayout>{
    private Context mContext;
    private NewsModel mNewsModel;
    private NewsAdapter mAdapter;

    public FirstTabPresenter(Context mContext) {
        this.mContext = mContext;
        mNewsModel = new NewsModel(mContext);
    }

    public void initNewsList(ListView listView, AdapterView.OnItemClickListener onItemClickListener){
        mAdapter = new NewsAdapter(mContext);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(onItemClickListener);
    }

    public void getNews(){
        mNewsModel.getNewsMessage(new OnMessageCallback<News>() {
            @Override
            public void messageCallback(ArrayList<News> list, String hint) {
                if(null != list && list.size() > 0){
                    mAdapter.updateItems(list);
                    mAdapter.notifyDataSetChanged();
                }else{
                    ToastHelper.showShort(mContext,hint);
                }
            }
        });
    }

}
