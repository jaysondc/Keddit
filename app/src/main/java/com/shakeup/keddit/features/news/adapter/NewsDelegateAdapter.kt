package com.shakeup.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.droidcba.kedditbysteps.commons.extensions.getFriendlyTime
import com.shakeup.keddit.R
import com.shakeup.keddit.commons.RedditNewsItem
import com.shakeup.keddit.commons.adapter.ViewType
import com.shakeup.keddit.commons.adapter.ViewTypeDelegateAdapter
import com.shakeup.keddit.commons.inflate
import com.shakeup.keddit.commons.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by Jayson on 8/30/2017.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}