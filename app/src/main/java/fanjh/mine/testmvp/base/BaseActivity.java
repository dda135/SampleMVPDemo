package fanjh.mine.testmvp.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

/**
 * Created by fanjh on 2017/2/9.
 * activity的基类
 */
public class BaseActivity extends FragmentActivity{
    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        mContext = this;
    }

    public static void startActivity(Context mContext,Class mClass){
        Intent intent = new Intent(mContext,mClass);
        mContext.startActivity(intent);
    }

}
