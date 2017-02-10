package fanjh.mine.testmvp.splash.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import fanjh.mine.testmvp.R;
import fanjh.mine.testmvp.base.IView;

/**
 * Created by fanjh on 2017/2/9.
 * MVP中的视图相关操作都应该在视图内部操作
 * 然后有Presenter进行调用
 */
public class SplashView extends FrameLayout implements IView {
    private LinearLayout mLayout;
    private TextView mText;
    private TextView mTimeText;

    public SplashView(Context mContext) {
        this(mContext,null);
    }

    public SplashView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SplashView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mLayout = (LinearLayout) inflate(context, R.layout.splash_content,null);
        mText = (TextView) mLayout.findViewById(R.id.tv_text);
        mTimeText = (TextView) mLayout.findViewById(R.id.tv_time);
        addView(mLayout);
    }

    @Override
    public View setupView() {
        return this;
    }

    public void changeText(String text){
        if(null != text) {
            if (!text.equals(mText.getText().toString())) {
                mText.setText(text);
            }
        }
    }

    public void changeTimeText(int time){
        if(null != mTimeText) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(time*1.0f/1000).append("秒");
            String oldTime = mTimeText.getText().toString();
            String newTime = stringBuilder.toString();
            if (!newTime.equals(oldTime)) {
                mTimeText.setText(newTime);
            }
        }
    }

}
