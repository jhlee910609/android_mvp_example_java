package com.example.junhee.ohmygirl_mvp_java.main2;

import android.support.annotation.NonNull;

/**
 * Created by JunHee on 2018. 1. 13..
 */

public class AnotherPresenter implements AnotherContract.Presenter {

    private AnotherContract.View view;
    private String text;


    public AnotherPresenter(@NonNull AnotherContract.View view,@NonNull String text) {
        this.view = view;
        this.text = text;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        view.setText(text);
    }
}
