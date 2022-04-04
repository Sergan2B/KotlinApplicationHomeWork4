package kg.geektech.kotlinapplicationhomework4.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geektech.kotlinapplicationhomework4.adapter.AdapterForThirdFragment
import kg.geektech.kotlinapplicationhomework4.base.BaseFragment
import kg.geektech.kotlinapplicationhomework4.databinding.FragmentThirdBinding
import kg.geektech.kotlinapplicationhomework4.view_model.MainViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding>() {
    private val adapter = AdapterForThirdFragment()
    private val viewModel: MainViewModel by activityViewModels()

    override fun inflateVB(inflater: LayoutInflater): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(inflater)
    }

    override fun initView() {
        initAdapter()
        viewModel.historyList.observe(viewLifecycleOwner) {
            adapter.addHistory(it)
        }
    }

    private fun initAdapter() {
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    }

    override fun initListener() {
    }
}