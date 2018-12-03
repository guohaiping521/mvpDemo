package com.mvpdemo.data;

import com.mvpdemo.base.CommonCallback;

public interface MainDataSource {

    void loadData(CommonCallback commonCallback);

    void loadExtralData(CommonCallback commonCallback);

}
