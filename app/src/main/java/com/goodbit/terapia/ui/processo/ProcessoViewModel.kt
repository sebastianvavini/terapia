package com.goodbit.terapia.ui.processo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProcessoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Processo Fragment"
    }
    val text: LiveData<String> = _text
}