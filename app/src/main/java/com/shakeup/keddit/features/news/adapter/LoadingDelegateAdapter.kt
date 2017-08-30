package com.shakeup.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.shakeup.keddit.R
import com.shakeup.keddit.commons.adapter.ViewType
import com.shakeup.keddit.commons.adapter.ViewTypeDelegateAdapter
import com.shakeup.keddit.commons.inflate

/**
 * Created by Jayson on 8/30/2017.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}