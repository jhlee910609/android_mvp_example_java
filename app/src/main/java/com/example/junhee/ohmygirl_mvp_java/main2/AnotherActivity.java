package com.example.junhee.ohmygirl_mvp_java.main2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.junhee.ohmygirl_mvp_java.R;
import com.example.junhee.ohmygirl_mvp_java.utils.ActivityUtils;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AnotherFragment anotherFragment = (AnotherFragment) getSupportFragmentManager().findFragmentById(R.id.content_frame);
        if (anotherFragment == null){
            anotherFragment = AnotherFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), anotherFragment, R.id.content_frame);
        }

        Intent intent = getIntent();
        String text = intent.getStringExtra("string");



        new AnotherPresenter(anotherFragment, text);

    }
}
