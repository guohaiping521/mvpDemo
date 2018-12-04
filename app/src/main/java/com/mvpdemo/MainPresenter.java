package com.mvpdemo;


import com.mvpdemo.base.BaseView;
import com.mvpdemo.base.CommonCallback;
import com.mvpdemo.data.MainDataSource;

public class MainPresenter implements MainContract.Presenter {

    private MainDataSource mMainDataSource;
    private MainViewI mMainView;

    public MainPresenter(MainDataSource mainDataSource, BaseView baseViewI) {
        mMainDataSource = mainDataSource;
        mMainView = (MainViewI) baseViewI;
        mMainView.setPresenter(this);
    }

    @Override
    public void loadData(int gradeId) {
        mMainDataSource.loadData(gradeId).start(new CommonCallback<String>() {
            @Override
            public void onLoadSuccess(String result) {
                mMainView.showSuccessView();
            }

            @Override
            public void onLoadFail(Exception e) {
                mMainView.showFailView();
            }
        });
    }

    @Override
    public void loadExtralData() {
        mMainDataSource.loadExtralData().start(new CommonCallback<String>() {
            @Override
            public void onLoadSuccess(String result) {
                mMainView.showExtralSuccessView();
            }

            @Override
            public void onLoadFail(Exception e) {
                mMainView.showExtralFailView();
            }
        });
    }

    @Override
    public void detachView() {
        mMainView = null;
    }
}
