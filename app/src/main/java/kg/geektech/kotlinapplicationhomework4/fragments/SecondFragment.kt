package kg.geektech.kotlinapplicationhomework4.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import kg.geektech.kotlinapplicationhomework4.base.BaseFragment
import kg.geektech.kotlinapplicationhomework4.databinding.FragmentSecondBinding
import kg.geektech.kotlinapplicationhomework4.view_model.MainViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    private val viewModel: MainViewModel by activityViewModels()

    override fun inflateVB(inflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater)
    }

    override fun initView() {
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounterSecond.text = it.toString()
        }
    }

    override fun initListener() {
    }
}