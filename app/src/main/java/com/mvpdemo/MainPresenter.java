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
        mMainDataSource=mainDataSource;
        mMainView= (MainViewI) baseViewI;
        mMainView.setPresenter(this);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        mMainDataSource.loadData(new CommonCallback() {
            @Override
            public void onLoadSuccess() {
                mMainView.showSuccessView();
            }

            @Override
            public void onLoadFail() {
                mMainView.showFailView();
            }
        });
    }

    public void loadExtralData() {
        mMainDataSource.loadExtralData(new CommonCallback() {
            @Override
            public void onLoadSuccess() {
                mMainView.showExtralSuccessView();
            }

            @Override
            public void onLoadFail() {
                mMainView.showExtralFailView();
            }
        });
    }

}
