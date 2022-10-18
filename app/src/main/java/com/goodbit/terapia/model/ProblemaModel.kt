package com.goodbit.terapia.model

class ProblemaModel {

    private var  id:Int
    private var sintoma:String=""
    private var desejo:String =""
    private var frustracao:String=""

    fun setSintoam(sintoma:String){
        this.sintoma=sintoma
    }
    fun getSintoma():String{
        return sintoma
    }
    fun setDesejo(desejo:String){
        this.desejo=desejo
    }
    fun getDesejo():String{
        return desejo
    }
    fun setFrustracao(frustracao:String){
        this.frustracao=frustracao
    }
    fun getFrustracao():String{
        return frustracao
    }
    constructor( id: Int, sintoma: String, desejo: String, frustracao: String){
        this.id=id
        this.sintoma=sintoma
        this.desejo=desejo
        this.frustracao=frustracao
    }


}