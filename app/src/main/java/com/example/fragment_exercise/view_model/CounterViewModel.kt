package com.example.fragment_exercise.view_model

import androidx.lifecycle.ViewModel

//untuk menyimpan data
//sebagai state management
//sebagai jembatan antar fragment
class CounterViewModel : ViewModel() {
    var counter: Int = 0

    fun increment() {
        counter++
    }

    fun decrement() {
        counter--
    }
}