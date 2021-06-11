package com.example.kotlinmessenger.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlinmessenger.ui.fragments.ChatFragment
import com.example.kotlinmessenger.ui.fragments.ContactsFragment
import com.example.kotlinmessenger.ui.fragments.ProfileFragment

class ViewPager2Adapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ChatFragment()
            1 -> ContactsFragment()
            2 -> ProfileFragment()
            else -> ChatFragment()
        }
    }
}