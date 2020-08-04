package com.twenk11k.clbs2fragments.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val textLiveData = MutableLiveData<String>()
    private val scrollYLiveData = MutableLiveData<Int>()

    fun selectText(text: String) {
        textLiveData.value = text
    }

    fun selectScrollY(scrollY: Int) {
        scrollYLiveData.value = scrollY
    }

    fun getTextLiveData(): LiveData<String> {
        return textLiveData
    }

    fun getScrollYLiveData(): LiveData<Int> {
        return scrollYLiveData
    }

}