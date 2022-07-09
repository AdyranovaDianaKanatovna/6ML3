package com.example.a6ml3.fragments

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.a6ml3.MainViewModel
import com.example.a6ml3.base.BaseFragment
import com.example.a6ml3.databinding.FragmentBottomBinding


class BottomFragment : BaseFragment<FragmentBottomBinding>() {
    private lateinit var viewModel: MainViewModel
    val fragment = Fragment()
    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun observe() {
    }

    override fun initClickListeners() {
        binding.btnCountPlus.setOnClickListener {
            viewModel.increment() }
        binding.btnCountMin.setOnClickListener{
            viewModel.decrement()
        }
    }
    override fun inflateViewBinding(): FragmentBottomBinding {
        return FragmentBottomBinding.inflate(layoutInflater)
    }

    override fun initView() {

    }
}
