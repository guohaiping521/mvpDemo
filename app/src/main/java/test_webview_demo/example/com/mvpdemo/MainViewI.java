package test_webview_demo.example.com.mvpdemo;

import test_webview_demo.example.com.mvpdemo.base.BaseViewI;

public interface MainViewI extends BaseViewI<MainPresenter> {

    void showExtralSuccessView();

    void showExtralFailView();
}
