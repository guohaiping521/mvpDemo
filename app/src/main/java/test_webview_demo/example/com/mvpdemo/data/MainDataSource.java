package test_webview_demo.example.com.mvpdemo.data;

public interface MainDataSource {

    interface MainDataCallback {

        void onLoadSuccess();

        void onLoadFail();
    }


    void loadData(MainDataCallback mainDataCallback);

    void loadExtralData(MainDataCallback mainDataCallback);
}
