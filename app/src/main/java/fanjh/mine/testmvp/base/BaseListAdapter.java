package fanjh.mine.testmvp.base;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanjh on 2017/2/9.
 * ListView适配器的基类
 */
public abstract class BaseListAdapter<T> extends BaseAdapter{
    protected List<T> lists;
    protected Context mContext;

    public BaseListAdapter(Context mContext) {
        this.mContext = mContext;
        lists = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItem(T item){
        lists.add(item);
    }

    public void addItems(List<T> items){
        lists.addAll(items);
    }

    public void clear(){
        lists.clear();
        notifyDataSetChanged();
    }

    public void updateItems(List<T> items){
        lists.clear();
        lists.addAll(items);
    }

    public void updateItem(T item){
        lists.clear();
        lists.add(item);
    }

}
