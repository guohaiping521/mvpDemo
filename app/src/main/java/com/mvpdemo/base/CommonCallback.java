package com.mvpdemo.base;

public interface CommonCallback<T> {

    /**
     * 回调成功
     * @param result
     */
    void onLoadSuccess(T result);

    /**
     * 失败
     * @param e
     */
    void onLoadFail(Exception e);

}
