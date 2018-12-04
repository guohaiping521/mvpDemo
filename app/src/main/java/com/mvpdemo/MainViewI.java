package com.mvpdemo;


import com.mvpdemo.base.BaseView;

public interface MainViewI extends BaseView<MainPresenter> {

    void showExtralSuccessView();

    void showExtralFailView();
}
