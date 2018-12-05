package com.mvpdemo;


import com.mvpdemo.base.BaseDataI;
import com.mvpdemo.base.BasePresenter;
import com.mvpdemo.base.BaseView;
import com.mvpdemo.base.CommonCallback;
import com.mvpdemo.data.MainDataSource;

public class MainPresenter<V extends MainContract.View> extends BasePresenter<V> implements MainContract.Presenter<V> {

    private MainDataSource mMainDataSource;

    public MainPresenter(BaseDataI dataManager) {
        super(dataManager);
        mMainDataSource= (MainDataSource) dataManager;
    }

    @Override
    public void loadData(int gradeId) {
        mMainDataSource.loadData(gradeId).start(new CommonCallback<String>() {
            @Override
            public void onLoadSuccess(String result) {
                getBaseView().showSuccessView();
            }

            @Override
            public void onLoadFail(Exception e) {
                getBaseView().showFailView();
            }
        });
    }

    @Override
    public void loadExtralData() {
        mMainDataSource.loadExtralData().start(new CommonCallback<String>() {
            @Override
            public void onLoadSuccess(String result) {
                getBaseView().showExtralSuccessView();
            }

            @Override
            public void onLoadFail(Exception e) {
                getBaseView().showExtralFailView();
            }
        });
    }

}
