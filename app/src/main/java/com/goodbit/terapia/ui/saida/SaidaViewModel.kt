package com.goodbit.terapia.ui.saida

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SaidaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Saída Fragment"
    }
    val text: LiveData<String> = _text
}