package com.goodbit.terapia.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.goodbit.terapia.viewmodel.Constants

class ProblemaDataBase( context: Context): SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object{
        private const val NAME ="problemasdb"
        private const val VERSION= 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table "+Constants.TABLE.TABLE_PROBLEMA+" (" +
                Constants.COLUMNS_PROBLEMA.id + " primary key autoincrement," +
                Constants.COLUMNS_PROBLEMA.sintomas+" text,"+
                Constants.COLUMNS_PROBLEMA.frustracoes+" text,"+
                Constants.COLUMNS_PROBLEMA.desejos+" text);")

        db.execSQL("create table "+Constants.TABLE.TABLE_AGENDA+ " (" +
                Constants.COLUMNS_AGENDA.id + " primary key autoincrement," +
                Constants.COLUMNS_AGENDA.tarefa+" text,"+
                Constants.COLUMNS_AGENDA.hora_inicio+" text,"+
                Constants.COLUMNS_AGENDA.minuto_inicio+" text,"+
                Constants.COLUMNS_AGENDA.hora_termino+" text,"+
                Constants.COLUMNS_AGENDA.minuto_termino+ "text,"+
                Constants.COLUMNS_AGENDA.ano+ "text,"+
                Constants.COLUMNS_AGENDA.mes+ "text,"+
                Constants.COLUMNS_AGENDA.dia+" text);")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}