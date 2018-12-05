package com.mvpdemo.data;

import com.mvpdemo.base.BaseDataI;
import com.mvpdemo.base.CommonCallback;
import com.mvpdemo.base.Observable;

public class MainRepository implements MainDataSource {

    private static MainRepository INSTANCE = null;

    public static MainRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MainRepository();
        }
        return INSTANCE;
    }

    @Override
    public Observable<String> loadData(int gradeId) {
        return new Observable<String>(){

            @Override
            public void start(CommonCallback<String> callback) {
                //耗时操作
                callback.onLoadSuccess("1122");
            }
        };
    }

    @Override
    public Observable<String> loadExtralData() {
        return new Observable<String>(){

            @Override
            public void start(CommonCallback<String> callback) {
                //耗时操作
                callback.onLoadSuccess("1122");
            }
        };
    }
}
