package com.twenk11k.clbs2fragments.ui.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.databinding.adapters.TextViewBindingAdapter
import com.twenk11k.clbs2fragments.R
import com.twenk11k.clbs2fragments.databinding.FragmentABinding
import com.twenk11k.clbschallange.ui.fragment.DataBindingFragment.DataBindingFragment

class FragmentA: DataBindingFragment() {

    private lateinit var binding: FragmentABinding
    private lateinit var editText: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = binding(inflater, R.layout.fragment_a, container)
        setViews()
        return binding.root
    }

    private fun setViews() {
        editText = binding.editText
        handleEditText()
    }

    private fun handleEditText() {
        editText.addTextChangedListener(object: TextViewBindingAdapter.OnTextChanged, TextWatcher {

            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
    }

}