package com.example.tinybooking.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tinybooking.R

/**
 * Created by schecterza on 9/22/2017.
 */

class FavoriteItemListAdapter: RecyclerView.Adapter<FavoriteItemListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.cardview_favorite, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bindData()
    }

    override fun getItemCount(): Int = 5

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindData() {
            itemView.setOnClickListener { onClick(itemView.context) }

        }

        private fun onClick(c: Context) {
            Toast.makeText(c, "Clicked", Toast.LENGTH_LONG).show()
        }
    }
}