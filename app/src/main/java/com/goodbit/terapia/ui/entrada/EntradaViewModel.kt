package com.goodbit.terapia.ui.entrada

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EntradaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Entrada Fragment"
    }
    val text: LiveData<String> = _text
}