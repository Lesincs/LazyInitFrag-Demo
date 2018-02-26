package com.lesincs.lazyinitfrag

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Administrator on 2018/2/26.
 */
class FragAdapter(fm: FragmentManager, val fragList: List<Fragment>, val titleList: List<String>) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return fragList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}