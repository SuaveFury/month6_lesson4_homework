package com.example.month6_lesson4_homework.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.month6_lesson4_homework.ui.Fragment1
import com.example.month6_lesson4_homework.ui.Fragment2
import com.example.month6_lesson4_homework.ui.Fragment3

class ViewPager(res: FragmentActivity):FragmentStateAdapter(res){
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Fragment1() 1 -> Fragment2() else -> Fragment3()}
    }
    override fun getItemCount(): Int {
        return 3
    }
}