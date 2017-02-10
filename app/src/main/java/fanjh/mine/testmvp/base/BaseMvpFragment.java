package fanjh.mine.testmvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fanjh on 2017/2/9.
 * MVP模式下Fragment的基类
 */
public abstract class BaseMvpFragment<V extends IView,P extends BasePresenter<V>> extends BaseFragment{
    protected P mPresenter;
    protected V mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(null == mView) {
            mView = setupView();
        }
        if(null == mPresenter){
            mPresenter = createPresenter();
            mPresenter.attachView(mView);
        }
        return mView.setupView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(null != mPresenter) {
            mPresenter.detachView();
            mPresenter = null;
        }
    }

    public abstract V setupView();
    public abstract P createPresenter();

}
