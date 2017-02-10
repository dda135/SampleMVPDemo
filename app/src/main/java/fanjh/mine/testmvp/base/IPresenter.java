package fanjh.mine.testmvp.base;

/**
 * Created by fanjh on 2017/2/9.
 * MVP中Presenter的基础接口
 */
public interface IPresenter<V extends IView> {
    void attachView(V view);
    void detachView();
}
