package com.example.junhee.ohmygirl_mvp_java.main2;

import com.example.junhee.ohmygirl_mvp_java.BasePresenter;
import com.example.junhee.ohmygirl_mvp_java.BaseView;

/**
 * Created by JunHee on 2018. 1. 13..
 */

public interface AnotherContract {

    interface Presenter extends BasePresenter {

    }

    interface View extends BaseView<AnotherPresenter>{
        void setText(String text);

    }
}
