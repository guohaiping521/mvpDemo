package com.mvpdemo.base;



public interface BasePresenterI<V extends BaseView> {

    void onAttach(V baseView);

    void detachView();
}
