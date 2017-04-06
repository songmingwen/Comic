package com.song.sunset.utils.service;

import com.song.sunset.beans.IfengNewsListBean;
import com.song.sunset.beans.VideoBean;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Song on 2017/3/30 .
 * E-mail: z53520@qq.com
 */

public interface IfengNewsApi {

    /**此处若不添加max-age信息，会统一在OfflineCacheControlInterceptor类中添加默认的max-age*/
    //    @Headers("Cache-Control: public, max-age=3600")
    @GET("ifengvideoList")
    Observable<List<VideoBean>> queryFirstVideoObservable(
            @Query("page") int page);

    @GET("ifengvideoList")
    Observable<List<VideoBean>> queryVideoObservable(
            @Query("page") int page,
            @Query("listtype") String listtype,
            @Query("typeid") String typeid);

    String UP = "up";
    String DOWN = "down";

    /**
     * 凤凰新闻头条接口
     * @param action up 上拉 down 下拉
     * @return
     */
    @GET("ClientNews")
    Observable<List<IfengNewsListBean>> queryIfengListObservable(
            @Query("action") String action);
}
