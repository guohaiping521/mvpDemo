package test_webview_demo.example.com.mvpdemo.base;

public interface BasePresenterI<T> {
    /**
     * 数据请求loading
     */
    void onLoad();

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
