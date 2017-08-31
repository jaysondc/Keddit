package com.shakeup.keddit.api

/**
 * Created by Jayson on 8/31/2017.
 *
 * These models allow Retrofit to parse Reddit repsonses to java objects
 */

class RedditNewsResponse(val data: RedditDataResponse)

class RedditDataResponse(
        val children: List<RedditChildrenResponse>,
        val after: String?,
        val before: String?
)

class RedditChildrenResponse(val data: RedditNewsDataResponse)

class RedditNewsDataResponse(
        val author: String,
        val title: String,
        val num_comments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
)