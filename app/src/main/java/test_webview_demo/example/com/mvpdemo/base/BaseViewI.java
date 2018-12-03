package test_webview_demo.example.com.mvpdemo.base;

public interface BaseViewI<T> {

    void setPresenter(T presenter);

    /**
     * 显示success的界面
     */
    void showSuccessView();

    /**
     * 显示失败的界面
     */
    void showFailView();

}
