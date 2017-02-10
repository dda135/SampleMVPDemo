package fanjh.mine.testmvp.base;

/**
 * Created by fanjh on 2017/2/9.
 * MVP中Presenter基类
 */
public class BasePresenter<V extends IView>  implements IPresenter<V> {
    protected V mView;

    @Override
    public void attachView(V view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
