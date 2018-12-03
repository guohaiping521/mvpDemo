package com.mvpdemo.data;

import com.mvpdemo.base.Observable;

public interface MainDataSource {

    Observable<String> loadData(int gradeId);

    Observable<String> loadExtralData();

}
