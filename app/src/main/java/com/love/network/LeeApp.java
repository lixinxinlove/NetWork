package com.love.network;

import android.app.Application;
import android.content.Context;

/**
 * Created by lixinxin on 2016/10/28.
 */

public class LeeApp extends Application {

   private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }

    public static Context getInstance(){

        return context;
    }



}
