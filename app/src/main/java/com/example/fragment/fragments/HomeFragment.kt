package com.example.fragment.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragment.R

class HomeFragment: Fragment(R.layout.home_fragment) {
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.editText)
        button = view.findViewById(R.id.button)

        button.setOnClickListener {
            val name = editText.text.toString()
            val action = HomeFragmentDirections.actionHomeFragment2ToProfileFragment2(name)
            findNavController().navigate(action)
        }
    }
}