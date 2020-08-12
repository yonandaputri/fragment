package com.example.fragment_exercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [CounterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CounterFragment : Fragment(), View.OnClickListener {
    lateinit var counterHandler: CounterHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        counterHandler = activity as CounterHandler
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment\
        val view = inflater.inflate(R.layout.fragment_counter, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        incrementBtn.setOnClickListener(this)
        decrementBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            incrementBtn -> {
               counterHandler.increment()
            }
            decrementBtn -> {
               counterHandler.decrement()
            }
        }
    }
}
