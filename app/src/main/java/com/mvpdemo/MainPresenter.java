package com.mvpdemo;


import com.mvpdemo.base.BasePresenter;
import com.mvpdemo.base.BaseViewI;
import com.mvpdemo.base.CommonCallback;
import com.mvpdemo.data.MainDataSource;

public class MainPresenter extends BasePresenter<MainViewI> {

    private MainDataSource mMainDataSource;
    private MainViewI mMainView;

    public MainPresenter(MainDataSource mainDataSource, BaseViewI baseViewI) {
        super(mainDataSource, baseViewI);
        mMainDataSource = mainDataSource;
        mMainView = (MainViewI) baseViewI;
        mMainView.setPresenter(this);
    }

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

}
