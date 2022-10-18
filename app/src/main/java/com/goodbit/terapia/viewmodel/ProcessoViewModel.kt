package com.goodbit.terapia.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.goodbit.terapia.model.ProblemaModel
import com.goodbit.terapia.model.ProblemaRepository

class ProcessoViewModel (application: Application) : AndroidViewModel(application){

    private val repository= ProblemaRepository.getInstance(application.applicationContext)

    private val inseriu= MutableLiveData<Boolean>()
    val inseriu_: LiveData<Boolean> = inseriu

    fun insert(problemaModel: ProblemaModel){

        inseriu.value= repository.insert(problemaModel)
    }
}