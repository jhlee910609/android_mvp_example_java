package com.example.junhee.ohmygirl_mvp_java.main;

import android.util.Log;

/**
 * Created by JunHee on 2018. 1. 13..
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mMainView;

    public MainPresenter(MainContract.View mainView) {
        if (mainView == null) Log.e("MainPresenter", "view is null!");
        mMainView = mainView;
        mMainView.setPresenter(this);
    }

    @Override
    public void start() {
        mMainView.showStart();

    }

    @Override
    public void showHi() {
        Log.e("MainPresenter", "show hi!");


    }

    @Override
    public void showBye() {
        Log.e("MainPresenter", "show bye!");
    }
}
