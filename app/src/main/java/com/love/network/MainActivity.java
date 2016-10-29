package com.love.network;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.love.network.data.MeizhiData;
import com.love.network.network.Api;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.green_dao)
    public Button btnGreenDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initEvent();

        Api.getMeizhi(1, new Observer<MeizhiData>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(MeizhiData meizhiData) {

                String str = meizhiData.getResults().get(0).getDesc();
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initEvent() {
        btnGreenDao.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.green_dao:

                break;

        }
    }
}
