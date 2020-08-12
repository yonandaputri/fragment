package com.example.fragment_exercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter_show.*

class MainActivity : AppCompatActivity(), CounterHandler {

    lateinit var counterFragment: CounterFragment
    lateinit var counterShowFragment: CounterShowFragment
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment = fragment as CounterFragment
        counterShowFragment = fragment2 as CounterShowFragment
    }

    override fun increment() {
        counter++
        counterShowFragment.showResult(counter.toString())
    }

    override fun decrement() {
        counter--
        counterShowFragment.showResult(counter.toString())
    }

    fun toSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }


}
