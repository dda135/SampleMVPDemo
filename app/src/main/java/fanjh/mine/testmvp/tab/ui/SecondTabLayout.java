package fanjh.mine.testmvp.tab.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import fanjh.mine.testmvp.R;
import fanjh.mine.testmvp.base.IView;

/**
 * Created by fanjh on 2017/2/9.
 */
public class SecondTabLayout extends FrameLayout implements IView{
    private LinearLayout mParent;

    public SecondTabLayout(Context context) {
        super(context);
        mParent = (LinearLayout) inflate(context, R.layout.tab_second_fragment,null);
        addView(mParent);
    }

    @Override
    public View setupView() {
        return this;
    }
}
