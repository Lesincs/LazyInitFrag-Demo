package com.lesincs.lazyinitfrag

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_test.view.*

/**
 * Created by Administrator on 2018/2/26.
 */
class ListAdapter(val dataList: List<String>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //kotlin中绑定数据的方式，with函数
        with(holder.itemView) {
            textView.text = dataList[position]
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}