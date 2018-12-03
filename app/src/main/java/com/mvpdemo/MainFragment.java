package com.mvpdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainFragment extends Fragment implements MainViewI,View.OnClickListener {

    private int gradeId=0;

    private MainPresenter mPresenter;
    private Context mContext;
    private Button mButton;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext=getContext();
        mButton = view.findViewById(R.id.button);
        view.findViewById(R.id.button1).setOnClickListener(this);
        mButton.setOnClickListener(this);
    }

    @Override
    public void setPresenter(MainPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showSuccessView() {
        Toast.makeText(mContext,"成功了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailView() {
        Toast.makeText(mContext,"失败了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                mPresenter.loadData(gradeId);
                break;
            case R.id.button1:
                mPresenter.loadExtralData();
                break;
        }
    }

    @Override
    public void showExtralSuccessView() {
        Toast.makeText(mContext,"额外方法成功了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showExtralFailView() {
        Toast.makeText(mContext,"额外方法失败了",Toast.LENGTH_SHORT).show();
    }
}
