package com.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.mvpdemo.base.BasePresenterI;
import com.mvpdemo.data.MainRepository;

public class MainActivity extends AppCompatActivity implements MainContract.View,View.OnClickListener {

    private MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mPresenter= new MainPresenter<>(this,MainRepository.getInstance());
        findViewById(R.id.loadData_btn).setOnClickListener(this);
        findViewById(R.id.loadExtraData_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loadData_btn:
                mPresenter.loadData(1);
                break;
            case R.id.loadExtraData_btn:
                mPresenter.loadExtralData();
                break;
        }
    }

    @Override
    public void showExtralSuccessView() {
        Toast.makeText(getApplicationContext(),"额外方法成功了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showExtralFailView() {
        Toast.makeText(getApplicationContext(),"额外方法失败了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccessView() {
        Toast.makeText(getApplicationContext(),"成功了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailView() {
        Toast.makeText(getApplicationContext(),"失败了",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
