package com.shakeup.keddit.commons

import com.shakeup.keddit.commons.adapter.AdapterConstants
import com.shakeup.keddit.commons.adapter.ViewType

/**
 * Created by Jayson on 8/30/2017.
 */
data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}

data class RedditNews(
        val after: String,
        val before: String,
        val news: List<RedditNewsItem>)