package com.mvpdemo.base;

public class BasePresenter<V extends BaseView, T extends BaseDataI> implements BasePresenterI {

    private V mBaseView;
    private T mBaseDataI;

    public BasePresenter(V baseView, T dataManager) {
        this.mBaseDataI = dataManager;
        this.mBaseView = baseView;
    }

    @Override
    public void detachView() {
        mBaseView = null;
    }

    public V getBaseView() {
        return mBaseView;
    }

    public T getDataSource() {
        return mBaseDataI;
    }
}
