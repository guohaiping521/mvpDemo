package com.mvpdemo.data;

import com.mvpdemo.base.CommonCallback;

public class MainRepository implements MainDataSource {

    private static MainRepository INSTANCE = null;

    public static MainRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainRepository();
        }
        return INSTANCE;
    }

    @Override
    public void loadData(CommonCallback commonCallback) {
        commonCallback.onLoadSuccess();
    }

    @Override
    public void loadExtralData(CommonCallback commonCallback) {
        commonCallback.onLoadSuccess();
    }
}
