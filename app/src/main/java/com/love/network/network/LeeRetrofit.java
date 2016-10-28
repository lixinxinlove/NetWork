package com.love.network.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lixinxin on 2016/10/28.
 */

public class LeeRetrofit {

    private LeeRetrofit() {
    }
    private static String Base_URL = "http://gank.io/api/";
    private static OkHttpClient mOkHttpClient;
    private static Retrofit mRetrofit;

    public static Retrofit getRetrofit() {

        if (null == mRetrofit) {
            if (null == mOkHttpClient) {
                mOkHttpClient = LeeOkHttp3.getOkHttpClient();
            }
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(mOkHttpClient)
                    .build();
        }
        return mRetrofit;
    }
}
