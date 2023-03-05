package com.example.month6_lesson4_homework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.month6_lesson4_homework.di.ViewModel
import com.example.month6_lesson4_homework.databinding.Fragment3Binding

class Fragment3 : Fragment() {
    private lateinit var thirdViewModel: ViewModel
    private lateinit var binding: Fragment3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = Fragment3Binding.inflate(layoutInflater)
        return binding.root
    }
    private fun init(){
        thirdViewModel.plus2.observe(viewLifecycleOwner, Observer {binding.clickListTv.text = it.toString()})
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        thirdViewModel = ViewModelProvider(requireActivity())[ViewModel::class.java]
        init()
    }
}