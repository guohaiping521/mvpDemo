package com.mvpdemo.data;

import com.mvpdemo.base.CommonCallback;

public interface MainDataSource {

    void loadData(CommonCallback mainDataCallback);

    void loadExtralData(CommonCallback mainDataCallback);

}
