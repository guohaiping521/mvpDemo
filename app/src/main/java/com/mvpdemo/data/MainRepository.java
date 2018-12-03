package com.mvpdemo.data;

public class MainRepository implements MainDataSource {

    private static MainRepository INSTANCE = null;

    public static MainRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainRepository();
        }
        return INSTANCE;
    }

    @Override
    public void loadData(MainDataCallback mainDataCallback) {
        mainDataCallback.onLoadSuccess();
    }

    @Override
    public void loadExtralData(MainDataCallback mainDataCallback) {
        mainDataCallback.onLoadSuccess();
    }
}
