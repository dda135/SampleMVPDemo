package fanjh.mine.testmvp.splash.tools;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import fanjh.mine.testmvp.api.utils.callback.OnCallBack;
import fanjh.mine.testmvp.api.utils.callback.OnCountDownCallback;

/**
 * Created by fanjh on 2017/2/9.
 * 倒计时工具类
 */
public class CountDownTools {
    private OnCountDownCallback mCallback;
    private int mTime;

    public CountDownTools(OnCountDownCallback mCallback) {
        this.mCallback = mCallback;
    }

    private Handler mHandler = new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(Message msg) {
            if(null != mCallback){
                int durTime = msg.arg1;
                mTime -= durTime;
                mCallback.onCall(mTime<0?0:mTime);
                if(mTime > 0){
                    mHandler.sendMessageDelayed(mHandler.obtainMessage(0,durTime,0),durTime);
                }
            }
        }
    };

    public void startCountDown(int sumTime,int durTime){
        mTime = sumTime;
        if(null != mCallback){
            mCallback.onStart(sumTime);
        }
        mHandler.sendMessageDelayed(mHandler.obtainMessage(0,durTime,0),durTime);
    }

    public void endCountDown(){
        mHandler.removeCallbacksAndMessages(null);
        mHandler = null;
    }


}
