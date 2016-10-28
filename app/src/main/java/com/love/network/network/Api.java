package com.love.network.network;

import com.love.network.data.MeizhiData;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static com.love.network.network.LeeRetrofit.getRetrofit;

/**
 * Created by lixinxin on 2016/10/28.
 */

public class Api {

    //创建实现接口调用
    protected static final GankApi service = getRetrofit().create(GankApi.class);

    //POST请求
    public static void getMeizhi(int page, Observer<MeizhiData> observer){
        setSubscribe(service.getMeizhiData(page),observer);
    }

    public static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
    }
}
