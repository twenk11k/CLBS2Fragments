package com.twenk11k.clbs2fragments.ui.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.databinding.adapters.TextViewBindingAdapter
import androidx.lifecycle.Observer
import com.twenk11k.clbs2fragments.R
import com.twenk11k.clbs2fragments.databinding.FragmentABinding
import com.twenk11k.clbs2fragments.ui.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class FragmentA : DataBindingFragment() {

    private lateinit var binding: FragmentABinding
    private lateinit var editText: EditText

    private val viewModel: MainViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = binding(inflater, R.layout.fragment_a, container)
        setViews()
        viewModel.getTextLiveData().observe(viewLifecycleOwner, Observer<String> {
            if (getTextEditText() != it)
                editText.setText(it)
        })
        return binding.root
    }

    private fun getTextEditText(): String {
        return editText.text.toString()
    }

    private fun setViews() {
        editText = binding.editText
        handleEditText()
    }

    private fun handleEditText() {
        editText.addTextChangedListener(object : TextViewBindingAdapter.OnTextChanged, TextWatcher {

            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (getTextEditText() != s)
                    viewModel.select(s.toString())
            }

        })
    }

}