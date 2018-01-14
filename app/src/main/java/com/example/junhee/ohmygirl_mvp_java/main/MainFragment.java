package com.example.junhee.ohmygirl_mvp_java.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.junhee.ohmygirl_mvp_java.R;
import com.example.junhee.ohmygirl_mvp_java.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements MainContract.View {


    private MainContract.Presenter mPresenter;

    @BindView(R.id.btnShowHi)
    Button btnShowHi;

    @BindView(R.id.btnShowBye)
    Button btnShowBye;

    @BindView(R.id.btnGo)
    Button btnGo;

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    public MainFragment() {
        // Required empty public constructor
    }

    @OnClick(R.id.btnGo)
    void goAnotherFragment() {
        Main2Fragment fragment = new Main2Fragment();
        ActivityUtils.addFragmentToActivity(getFragmentManager(), fragment, R.id.content_frame);
        ((MainActivity) getActivity()).addFragment(fragment);


//        Intent intent = new Intent(getContext(), AnotherActivity.class);
//        intent.putExtra("string", "start!!!!!!!!!!!!!!!!!!!!!!!!!");
//        startActivity(intent);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @OnClick(R.id.btnShowHi)
    void showHi() {
        btnHiClicked();

    }

    @OnClick(R.id.btnShowBye)
    void showBye() {
        btnByeClicked();

    }

    @Override
    public void btnHiClicked() {
        mPresenter.showHi();
        Toast.makeText(getContext(), "hi!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void btnByeClicked() {
        mPresenter.showBye();
        Toast.makeText(getContext(), "bye!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showStart() {
        Toast.makeText(getContext(), "start!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setPresenter(MainPresenter presenter) {
        this.mPresenter = presenter;
    }
}
