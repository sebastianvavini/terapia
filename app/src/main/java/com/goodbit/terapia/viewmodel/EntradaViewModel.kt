package com.goodbit.terapia.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.goodbit.terapia.model.ProblemaModel
import com.goodbit.terapia.model.ProblemaRepository

class EntradaViewModel(application: Application) : AndroidViewModel(application) {

    private val repository= ProblemaRepository.getInstance(application.applicationContext)

    private val listAllProblemas= MutableLiveData<List<ProblemaModel>>()
    val problemas: LiveData<List<ProblemaModel>> = listAllProblemas


    fun getAll(){
        listAllProblemas.value=    repository.getAllProblems()
    }




}