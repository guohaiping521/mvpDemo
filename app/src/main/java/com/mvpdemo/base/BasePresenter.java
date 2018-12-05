package com.mvpdemo.base;

public class BasePresenter<V extends BaseView> implements BasePresenterI<V> {

    private V mBaseView;
    private final BaseDataI mBaseDataI;

    public BasePresenter(BaseDataI dataManager) {
        this.mBaseDataI = dataManager;
    }

    @Override
    public void onAttach(V baseView) {
        this.mBaseView = baseView;
    }

    @Override
    public void detachView() {
        mBaseView = null;
    }

    public V getBaseView() {
        return mBaseView;
    }

    public BaseDataI getDataSource() {
        return mBaseDataI;
    }
}
