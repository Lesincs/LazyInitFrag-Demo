package com.lesincs.lazyinitfrag

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.frag_lazy_init_test.*

/**
 * Created by Administrator on 2018/2/26.
 */
class FragLazyInitTest : AbstractLazyInitFrag() {

    private val dataList = ArrayList<String>()
    private val adapter = ListAdapter(dataList)

    /*初始化一般在这里实现*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }

    override fun getLayoutId(): Int {
        return R.layout.frag_lazy_init_test
    }

    override fun initData() {
        /*模拟的加载数据过程,实际场景一般是网络请求或者数据库等耗时操作*/
        swipeRefreshLayoutFLIT.isRefreshing = true
        swipeRefreshLayoutFLIT.postDelayed({
            swipeRefreshLayoutFLIT.isRefreshing = false
            dataList.add("data1")
            dataList.add("data2")
            dataList.add("data3")
            dataList.add("data4")
            dataList.add("data5")
            dataList.add("data6")
            dataList.add("data7")
            dataList.add("data8")
            adapter.notifyDataSetChanged()
        }, 2000)
    }
}