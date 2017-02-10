package fanjh.mine.testmvp.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

/**
 * Created by fanjh on 2017/2/9.
 * MVP模式的activity基类
 */
public abstract class BaseMvpActivity<T extends IView,K extends IPresenter<T>> extends BaseActivity{
    protected K mPresenter;
    protected T mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        mView = getContentView();
        mPresenter.attachView(mView);
        setContentView(getView());
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        mPresenter = null;
        super.onDestroy();
    }

    @NonNull
    public abstract K createPresenter();

    @NonNull
    public abstract T getContentView();

    public View getView(){
        if(null != mView){
            return mView.setupView();
        }
        return null;
    }

}
