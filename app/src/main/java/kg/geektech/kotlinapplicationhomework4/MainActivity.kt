package kg.geektech.kotlinapplicationhomework4

import android.view.LayoutInflater
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kg.geektech.kotlinapplicationhomework4.adapter.PagerAdapter
import kg.geektech.kotlinapplicationhomework4.base.BaseActivity
import kg.geektech.kotlinapplicationhomework4.databinding.ActivityMainBinding
import kg.geektech.kotlinapplicationhomework4.extentions.setIconAlpha
import kg.geektech.kotlinapplicationhomework4.extentions.setIconColor

/*
- Добавить ViewPager2 из 3 фрагментов в Главном Активити +++++
- Первый фрагмент кнопки "+" и "-", при нажатии
вызывать соответствующие методы у ViewModel и выполнять необходимую логику +++++
- Второй фрагмент отображает текущее значение LiveData счетчика  +++++
- Третий фрагмент отображает список выполненных операции
(Просто список строковых значений, которые наблюдаются у ViewModel) +++++
- Для всех задач использовать один ViewModel +++++
*/
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateVB(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        initViewPager()
        initTabLayout()
    }

    private fun initTabLayout() {
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_confirmation_number_24)
                    setIconColor(tab, R.color.purple_500)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_countertops_24)
                    setIconColor(tab, R.color.teal_200)
                    setIconAlpha(tab, 70)
                }
                else -> {
                    tab.setIcon(R.drawable.ic_baseline_history_24)
                    setIconColor(tab, R.color.teal_700)
                    setIconAlpha(tab, 70)
                }
            }
        }.attach()
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                setIconAlpha(tab, 250)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                setIconAlpha(tab, 70)
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun initViewPager() {
        binding.viewPager2.adapter = PagerAdapter(this)
    }
}