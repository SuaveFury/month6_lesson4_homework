package com.example.month6_lesson4_homework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.month6_lesson4_homework.di.ViewModel
import com.example.month6_lesson4_homework.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var firstViewModel: ViewModel
    private lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = Fragment1Binding.inflate(layoutInflater)
        return binding.root
    }
    private fun initClick(){
        binding.minus.setOnClickListener {firstViewModel.decreaseInit()}
        binding.plus.setOnClickListener {firstViewModel.increaseInit()}
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
        firstViewModel = ViewModelProvider(requireActivity())[ViewModel::class.java]
    }
}