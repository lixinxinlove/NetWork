package com.love.network;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.love.network.activity.GreenDaoActivity;
import com.love.network.activity.MPAndroidChartActivity;
import com.love.network.appwidget.LeeProgressLoading;
import com.love.network.data.MeizhiData;
import com.love.network.data.db.DBManager;
import com.love.network.data.entity.UserEntity;
import com.love.network.data.greendao.UserEntityDao;
import com.love.network.network.Api;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.green_dao)
    public Button btnGreenDao;


    @BindView(R.id.mapc)
    public Button btnMapc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        UserEntityDao userEntityDao = DBManager.getInstance(this).getDaoSession().getUserEntityDao();

        UserEntity userEntity=new UserEntity();
        userEntity.setId(0L);
        userEntity.setUserName("lixinxin");
        userEntity.setAge(100);
        userEntityDao.insertOrReplace(userEntity);


        LeeProgressLoading.show(this, "", true, new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                LeeProgressLoading.hideDialog();
            }
        });


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
        btnMapc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.green_dao:
                startActivity(new Intent(this, GreenDaoActivity.class));
                break;
            case R.id.mapc:
                startActivity(new Intent(this, MPAndroidChartActivity.class));
                break;

        }
    }
}
