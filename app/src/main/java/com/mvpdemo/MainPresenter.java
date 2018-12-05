package com.mvpdemo;


import com.mvpdemo.base.BasePresenter;
import com.mvpdemo.base.CommonCallback;
import com.mvpdemo.data.MainDataSource;

public class MainPresenter<V extends MainContract.View,T extends MainDataSource>
        extends BasePresenter<V,T> implements MainContract.Presenter {

    public MainPresenter(V baseView, T dataManager) {
        super(baseView, dataManager);
    }

    @Override
    public void loadData(int gradeId) {
        getDataSource().loadData(gradeId).start(new CommonCallback<String>() {
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
        getDataSource().loadExtralData().start(new CommonCallback<String>() {
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
