package fanjh.mine.testmvp.api.utils.hint;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by fanjh on 2017/2/9.
 * 模拟Toast工具类
 */
public class ToastHelper {
    private static Toast mToast;

    private static Toast getInstatnce(Context context){
        if(null == mToast) {
            synchronized (ToastHelper.class) {
                if (null == mToast) {
                    mToast = Toast.makeText(context, "", Toast.LENGTH_LONG);
                }
            }
        }
        return mToast;
    }

    public static void showLong(Context context,String text){
        if(null != getInstatnce(context)){
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_LONG);
            mToast.show();
        }
    }

    public static void showShort(Context context,String text){
        if(null != getInstatnce(context)){
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_SHORT);
            mToast.show();
        }
    }

}
