package fanjh.mine.testmvp.splash.presenter;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

import fanjh.mine.testmvp.api.utils.callback.OnCountDownCallback;
import fanjh.mine.testmvp.api.utils.callback.OnMessageCallback;
import fanjh.mine.testmvp.base.BaseActivity;
import fanjh.mine.testmvp.base.BasePresenter;
import fanjh.mine.testmvp.splash.model.SplashEntity;
import fanjh.mine.testmvp.splash.model.SplashModel;
import fanjh.mine.testmvp.splash.tools.CountDownTools;
import fanjh.mine.testmvp.splash.ui.SplashView;
import fanjh.mine.testmvp.tab.activity.TabActivity;

/**
 * Created by fanjh on 2017/2/9.
 */
public class SplashPresenter extends BasePresenter<SplashView>{
    private SplashModel mSplashModel;
    private ArrayList<CountDownTools> mCountDownToolList;
    private Context mContext;

    public SplashPresenter(Context mContext) {
        this.mContext = mContext;
        mSplashModel = new SplashModel();
    }

    /**
     * 通过模型获取数据
     */
    public void getSplashMessage(){
        mSplashModel.getSplashs(new OnMessageCallback<SplashEntity>() {
            @Override
            public void messageCallback(ArrayList<SplashEntity> list,String hint) {
                if(null != list && list.size() > 0) {
                    mView.changeText("有数据！");
                }else{
                    mView.changeText("没有数据！");
                }
            }
        });
    }

    /**
     * 开始倒计时
     */
    public void startCountDown(){
        if(null == mCountDownToolList){
            mCountDownToolList = new ArrayList<>();
        }
        CountDownTools countDownTools = new CountDownTools(new OnCountDownCallback() {
            @Override
            public void onCall(int time) {
                if(time == 0){
                    BaseActivity.startActivity(mContext,TabActivity.class);
                }
                mView.changeTimeText(time);
            }

            @Override
            public void onStart(int time) {
                mView.changeTimeText(time);
            }
        });
        mCountDownToolList.add(countDownTools);
        countDownTools.startCountDown(5000, 1000);
    }

    @Override
    public void detachView() {
        super.detachView();
        if(null != mCountDownToolList){
            for(CountDownTools countDownTools:mCountDownToolList)
                countDownTools.endCountDown();
            mCountDownToolList.clear();
            mCountDownToolList = null;
        }
    }
}
