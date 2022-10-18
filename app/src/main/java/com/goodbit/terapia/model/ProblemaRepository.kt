package com.goodbit.terapia.model

import android.content.Context
import com.goodbit.terapia.viewmodel.Constants

class ProblemaRepository private constructor(context: Context){

    private val problemaDataBase = ProblemaDataBase(context)

    companion object{
        private lateinit var repository: ProblemaRepository
        fun getInstance(context: Context):ProblemaRepository{

            if(!::repository.isInitialized){
                repository= ProblemaRepository(context)
            }
            return repository
        }


    }fun insert(problemaModel: ProblemaModel){


    }

    fun getAllProblems():List<ProblemaModel>{
        val list= mutableListOf<ProblemaModel>()

        try {
            val db= problemaDataBase.readableDatabase

            val id= Constants.COLUMNS_PROBLEMA.id
            val desejos=Constants.COLUMNS_PROBLEMA.desejos
            val frustracoes= Constants.COLUMNS_PROBLEMA.frustracoes
            val sintomas= Constants.COLUMNS_PROBLEMA.sintomas

            val selection= arrayOf(
                desejos,
                frustracoes,
                sintomas
            )
            val tabela =Constants.TABLE.TABLE_PROBLEMA
            val cursor = db.query(tabela,selection,
                null,null, null, null, null)

            if (cursor!=null && cursor.count>0){
                while (cursor.moveToNext()){
                    val id_ = cursor.getInt(cursor.getColumnIndex(id))
                    val desejos_= cursor.getString(cursor.getColumnIndex(desejos))
                    val frustacaoes_=cursor.getString(cursor.getColumnIndex(frustracoes))
                    val sintomas_= cursor.getString(cursor.getColumnIndex(sintomas))

                    val problema_= ProblemaModel(id_, sintomas_,desejos_,frustacaoes_)
                    list.add(problema_)
                }
                cursor.close()
            }

        }

        catch (e:Exception){
            return list
        }

        return list

    }

}