package com.example.month6_lesson4_homework.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.month6_lesson4_homework.di.ViewPager
import com.example.month6_lesson4_homework.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vp.adapter = ViewPager(this)
        binding.dotsIndicator.attachTo(binding.vp)
    }
}