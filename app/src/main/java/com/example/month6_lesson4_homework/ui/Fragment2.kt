package com.example.month6_lesson4_homework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.month6_lesson4_homework.di.ViewModel
import com.example.month6_lesson4_homework.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    private lateinit var secondViewModel: ViewModel
    private lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = Fragment2Binding.inflate(layoutInflater)
        return binding.root
    }
    private fun init(){
        secondViewModel.numerator.observe(viewLifecycleOwner, Observer {binding.numeratorTv.text = it.toString()})
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        secondViewModel = ViewModelProvider(requireActivity())[ViewModel::class.java]
        init()
    }
}