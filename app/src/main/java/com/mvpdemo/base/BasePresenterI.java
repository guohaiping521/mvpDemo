package com.mvpdemo.base;

public interface BasePresenterI<T> {

    /**
     * 是否与view建立了连接
     */
    boolean isViewAttached();

    /**
     * 获取当前view
     */
    T getView();

    /**
     * 断开view，onDestroy中执行
     */
    void detachView();

}
