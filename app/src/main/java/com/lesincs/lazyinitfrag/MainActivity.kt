package com.lesincs.lazyinitfrag

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val titleList = arrayListOf<String>("fragment1","fragment2","fragment3","fragment4","fragment5")
        val fragList = arrayListOf<Fragment>(FragLazyInitTest(),FragLazyInitTest(),FragLazyInitTest(),FragLazyInitTest(),FragLazyInitTest())
        viewPagerAM.adapter = FragAdapter(supportFragmentManager,fragList,titleList)
        //设置frag缓存数量,一般设置为数量为总数-1
        viewPagerAM.offscreenPageLimit = 4
        //绑定tabLayout和viewPager
        tabLayoutAM.setupWithViewPager(viewPagerAM)
    }
}
