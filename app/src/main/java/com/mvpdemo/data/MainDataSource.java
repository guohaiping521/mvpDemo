package com.mvpdemo.data;

import com.mvpdemo.base.BaseDataI;
import com.mvpdemo.base.BaseView;
import com.mvpdemo.base.Observable;

public interface MainDataSource extends BaseDataI{

    Observable<String> loadData(int gradeId);

    Observable<String> loadExtralData();

}
