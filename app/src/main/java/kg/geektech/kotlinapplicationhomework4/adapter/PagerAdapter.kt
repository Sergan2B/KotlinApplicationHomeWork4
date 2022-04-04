package kg.geektech.kotlinapplicationhomework4.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.geektech.kotlinapplicationhomework4.fragments.FirstFragment
import kg.geektech.kotlinapplicationhomework4.fragments.SecondFragment
import kg.geektech.kotlinapplicationhomework4.fragments.ThirdFragment

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }
}