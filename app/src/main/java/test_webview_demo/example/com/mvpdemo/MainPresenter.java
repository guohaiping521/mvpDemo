package test_webview_demo.example.com.mvpdemo;

import test_webview_demo.example.com.mvpdemo.base.BasePresenter;
import test_webview_demo.example.com.mvpdemo.base.BaseViewI;
import test_webview_demo.example.com.mvpdemo.data.MainDataSource;

public class MainPresenter extends BasePresenter<MainViewI>  {

    private MainDataSource mMainDataSource;
    private MainViewI mMainView;

    public MainPresenter(MainDataSource mainDataSource, BaseViewI baseViewI) {
        super(mainDataSource, baseViewI);
        mMainDataSource=mainDataSource;
        mMainView= (MainViewI) baseViewI;
        mMainView.setPresenter(this);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        mMainDataSource.loadData(new MainDataSource.MainDataCallback() {
            @Override
            public void onLoadSuccess() {
                mMainView.showSuccessView();
            }

            @Override
            public void onLoadFail() {
                mMainView.showFailView();
            }
        });
    }

    public void loadExtralData() {
        mMainDataSource.loadExtralData(new MainDataSource.MainDataCallback() {
            @Override
            public void onLoadSuccess() {
                mMainView.showExtralSuccessView();
            }

            @Override
            public void onLoadFail() {
                mMainView.showExtralFailView();
            }
        });
    }

}
