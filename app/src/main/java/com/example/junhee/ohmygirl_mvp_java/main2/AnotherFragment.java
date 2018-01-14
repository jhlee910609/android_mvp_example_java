package com.example.junhee.ohmygirl_mvp_java.main2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.junhee.ohmygirl_mvp_java.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnotherFragment extends Fragment implements AnotherContract.View {

    @BindView(R.id.tv_number)
    TextView tvNumb;

    AnotherPresenter presenter;

    public static AnotherFragment newInstance() {
        return new AnotherFragment();
    }

    public AnotherFragment() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.start();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_another, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @Override
    public void setPresenter(AnotherPresenter presenter) {
        this.presenter = presenter;


    }

    @Override
    public void setText(String text) {
        tvNumb.setText(text);
    }
}
