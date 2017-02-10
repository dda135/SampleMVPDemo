package fanjh.mine.testmvp.tab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fanjh.mine.testmvp.R;
import fanjh.mine.testmvp.base.BaseListAdapter;
import fanjh.mine.testmvp.tab.model.News;

/**
 * Created by fanjh on 2017/2/9.
 */
public class NewsAdapter extends BaseListAdapter<News>{

    public NewsAdapter(Context mContext) {
        super(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return LayoutInflater.from(mContext).inflate(R.layout.adapter_news,parent,false);
    }

}
