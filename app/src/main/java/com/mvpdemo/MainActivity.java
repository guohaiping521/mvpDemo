package com.mvpdemo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvpdemo.data.MainRepository;
import com.mvpdemo.utils.ActivityUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        MainFragment mainFragment = (MainFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    mainFragment, R.id.contentFrame);
        }
        new MainPresenter(MainRepository.getInstance(),mainFragment);
    }
}
