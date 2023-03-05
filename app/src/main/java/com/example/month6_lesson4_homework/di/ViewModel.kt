package com.example.month6_lesson4_homework.di

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel(){
    var plus = ""
    private var numeratorX = 0
    var plus2 = MutableLiveData<String>()
    var numerator = MutableLiveData<Int>()
    fun decreaseInit(){
        plus = "\n- $plus"
        plus2.value = plus
        numeratorX--
        numerator.value = numeratorX}
    fun increaseInit(){
        plus = "\n+ $plus"
        plus2.value = plus
        numeratorX++
        numerator.value = numeratorX}
}