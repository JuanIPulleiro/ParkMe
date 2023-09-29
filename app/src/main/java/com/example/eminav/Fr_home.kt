package com.example.eminav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Frhome : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_fr_home, container, false)
        val button = view.findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_fr_home_to_fr_data)
        }

        return view

    }

}