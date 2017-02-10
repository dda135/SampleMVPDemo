package fanjh.mine.testmvp.tab.ui;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

import fanjh.mine.testmvp.R;
import fanjh.mine.testmvp.base.IView;

/**
 * Created by fanjh on 2017/2/9.
 */
public class FirstTabLayout extends FrameLayout implements IView{
    private LinearLayout mParent;
    private ListView mListView;

    public FirstTabLayout(Context context) {
        super(context);
        mParent = (LinearLayout) inflate(context, R.layout.tab_first_fragment,null);
        mListView = (ListView) mParent.findViewById(R.id.lv_first_content);
        addView(mParent);
    }

    @Override
    public View setupView() {
        return this;
    }

    public ListView getListView(){
        if(null == mListView){
            throw new NullPointerException("...");
        }
        return mListView;
    }
}
