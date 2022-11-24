package com.kusitms7team.aos

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class BannerVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    //여러개의 fragment들을 담아둘 공간이 필요하다.
    //하나의 list를 만들어서 여러개의 fragment를 담아둔다.
    private val fragmentlist : ArrayList<Fragment> = ArrayList()


    override fun getItemCount(): Int {
        //이곳 class에서 연결된 viewPager에게 데이터를 전달할때 data를 몇개를 전달할 것인지를 써주는 함수
        return fragmentlist.size
    }

    //fragmemnt안에 있는 list들을 생성해주는 함수
    override fun createFragment(position: Int): Fragment = fragmentlist[position]

    fun addFragment(fragment: Fragment) {
        fragmentlist.add(fragment)
        notifyItemInserted(fragmentlist.size-1)
    }

}