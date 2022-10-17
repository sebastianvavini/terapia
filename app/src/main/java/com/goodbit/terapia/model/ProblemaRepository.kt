package com.goodbit.terapia.model

import android.content.Context

class ProblemaRepository private constructor(context: Context){
    private val problemaDataBase = ProblemaDataBase(context)
}