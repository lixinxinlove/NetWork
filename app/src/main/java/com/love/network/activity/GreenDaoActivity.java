package com.love.network.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.love.network.R;
import com.love.network.data.db.DBManager;
import com.love.network.data.entity.UserEntity;
import com.love.network.data.greendao.UserEntityDao;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GreenDaoActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.save)
    public Button btnSave;

    @BindView(R.id.fill)
    public Button btnFill;

    @BindView(R.id.tv)
    public TextView tv;

    private UserEntityDao userEntityDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_dao);
        ButterKnife.bind(this);
        initEvent();
        userEntityDao = DBManager.getInstance(this).getDaoSession().getUserEntityDao();
    }

    private void initEvent() {
        btnSave.setOnClickListener(this);
        btnFill.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.save:
                insertUser();
                break;
            case R.id.fill:
                loadUser();
                break;
        }
    }

    private void loadUser() {

        List<UserEntity> users=userEntityDao.loadAll();
        String s="";
        if (users!= null) {
            for(UserEntity user:users){
                s+=user.getId()+"--"+user.getUserName()+"--"+user.getAge()+"\n";
            }
            tv.setText(s);
        } else {
            tv.setText("没有数据");
        }
    }

    private void insertUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(20);
        userEntity.setId(3L);
        userEntity.setUserName("lee");
        userEntityDao.insertOrReplace(userEntity);
    }
}
