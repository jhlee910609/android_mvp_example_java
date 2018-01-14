package com.example.junhee.ohmygirl_mvp_java.main;

import com.example.junhee.ohmygirl_mvp_java.BasePresenter;
import com.example.junhee.ohmygirl_mvp_java.BaseView;

/**
 * Created by JunHee on 2018. 1. 13..
 */

public interface MainContract {

    interface View extends BaseView<MainPresenter> {
            void btnHiClicked();
            void btnByeClicked();
            void showStart();


    }

    interface Presenter extends BasePresenter {
        void showHi();
        void showBye();

    }
}
