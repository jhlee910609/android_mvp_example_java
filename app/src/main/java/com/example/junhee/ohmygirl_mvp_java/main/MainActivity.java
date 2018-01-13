package com.example.junhee.ohmygirl_mvp_java.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.junhee.ohmygirl_mvp_java.R;
import com.example.junhee.ohmygirl_mvp_java.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity {

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
        new MainPresenter(mainFragment);
    }
}
