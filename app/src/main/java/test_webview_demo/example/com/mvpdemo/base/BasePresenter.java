package test_webview_demo.example.com.mvpdemo.base;

import test_webview_demo.example.com.mvpdemo.data.MainDataSource;

public abstract class BasePresenter<V extends BaseViewI> implements BasePresenterI<V> {

    public BasePresenter(MainDataSource mainDataSource, BaseViewI baseViewI) { }

    /**
     * 绑定的view
     */
    private V mBaseView;

    /**
     * 加载数据
     */
    @Override
    public void onLoad() {
        if (!isViewAttached()) {
            return;
        }
    }

    @Override
    public boolean isViewAttached() {
        return mBaseView != null;
    }

    @Override
    public V getView() {
        return mBaseView;
    }

    @Override
    public void detachView() {
        mBaseView = null;
    }
}
