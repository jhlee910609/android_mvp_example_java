package com.example.junhee.ohmygirl_mvp_java.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.junhee.ohmygirl_mvp_java.R;
import com.example.junhee.ohmygirl_mvp_java.utils.ActivityUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Main2Fragment.OnBackKeyListener {

    // test

    ArrayList<android.support.v4.app.Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment
                = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.content_frame);
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mainFragment, R.id.content_frame);
        }
        fragments.add(mainFragment);
        new MainPresenter(mainFragment);
    }

    public void addFragment(Fragment fragment) {
        fragments.add(fragment);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    // 뒤로 가기
    @Override
    public void goBack(Fragment fragment) {
        ActivityUtils.popFragmentToActivity(getSupportFragmentManager(), fragment, R.id.content_frame);

    }
}