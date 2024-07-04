package com.example.shpeapp.ui.join

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JoinViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is join fragment"
    }
    val text: LiveData<String> = _text
}
