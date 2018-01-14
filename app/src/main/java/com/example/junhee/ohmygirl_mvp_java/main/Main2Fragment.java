package com.example.junhee.ohmygirl_mvp_java.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.junhee.ohmygirl_mvp_java.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Main2Fragment extends Fragment implements MainContract.View{

    private MainPresenter presenter;

    public static Main2Fragment newInstace(){
        return new Main2Fragment();
    }

    public Main2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main2, container, false);
    }

    @Override
    public void setPresenter(MainPresenter presenter) {
        this.presenter = presenter;

    }

    @Override
    public void btnHiClicked() {

    }

    @Override
    public void btnByeClicked() {

    }

    @Override
    public void showStart() {

    }

    public interface OnBackKeyListener{
        void goBack(Fragment fragment);

    }

}
