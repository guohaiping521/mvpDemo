package com.mvpdemo;


import com.mvpdemo.base.BaseViewI;

public interface MainViewI extends BaseViewI<MainPresenter> {

    void showExtralSuccessView();

    void showExtralFailView();
}
