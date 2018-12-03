package com.mvpdemo.base;

public abstract class Observable<T> {
    public abstract void start(CommonCallback<T> callback);
}
