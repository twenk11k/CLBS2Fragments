package com.twenk11k.clbs2fragments.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.twenk11k.clbs2fragments.R
import com.twenk11k.clbs2fragments.databinding.FragmentBBinding
import com.twenk11k.clbschallange.ui.fragment.DataBindingFragment

class FragmentB: DataBindingFragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = binding(inflater, R.layout.fragment_b, container)
        return binding.root
    }

}