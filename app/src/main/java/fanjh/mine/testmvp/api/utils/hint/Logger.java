package fanjh.mine.testmvp.api.utils.hint;

import android.util.Log;

/**
 * Created by fanjh on 2017/2/9.
 * 模拟日志工具类
 */
public class Logger {
    public static final String TAG = "TAG";
    public static void i(String text){
        Log.i(TAG,text);
    }
    public static void d(String text){
        Log.d(TAG,text);
    }
}
