package com.love.network.network;

import com.love.network.data.MeizhiData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by lixinxin on 2016/10/28.
 */

public interface GankApi {
    @GET("data/福利/" + "20"+ "/{page}")
    Observable<MeizhiData> getMeizhiData(@Path("page") int page);

}
