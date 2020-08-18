package com.example.fragment_exercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import com.example.fragment_exercise.view_model.CounterViewModel
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.fragment_counter_show.*
import kotlinx.android.synthetic.main.fragment_counter_show.view.*
import org.w3c.dom.Text

/**
 * A simple [Fragment] subclass.
 * Use the [CounterShowFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CounterShowFragment() : Fragment() {

    val counterViewModel by activityViewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_counter_show, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        counterTextView.text = counterViewModel.counter.toString()
    }


}
