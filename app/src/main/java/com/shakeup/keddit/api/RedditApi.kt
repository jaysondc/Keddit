package com.shakeup.keddit.api


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Jayson on 8/31/2017.
 * Interface to construct calls to the Reddit API
 */

interface  RedditApi {
    @GET("/top.json")
    fun getTop(@Query("after") after: String,
               @Query("limit") limit: String): Call<RedditNewsResponse>;
}