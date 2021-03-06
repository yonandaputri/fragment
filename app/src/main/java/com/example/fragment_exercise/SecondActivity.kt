package com.example.fragment_exercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var counterFragment: CounterFragment
    lateinit var counterShowFragment: CounterShowFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        toCounterFragmentButton.setOnClickListener(this)
        toCounterShowFragmentButton.setOnClickListener(this)
        counterFragment = CounterFragment()
        counterShowFragment = CounterShowFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, counterFragment).commit()
    }

    // karena ada switch fragment, jadi ngga langsung manggil showFragment disini

    override fun onClick(v: View?) {
        when(v) {
            toCounterFragmentButton -> {switchFragment(counterFragment)}
            toCounterShowFragmentButton -> {switchFragment(counterShowFragment)}
        }
    }

    fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
}
