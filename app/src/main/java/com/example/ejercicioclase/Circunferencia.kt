package com.example.ejercicioclase

import kotlin.math.PI

open class Circunferencia(var radio:Double) {
    var centro= arrayOf(0,0)

    constructor(radio:Double,centro:Array<Int>,punto) : this(radio){
        this.centro=centro

    }


    fun longitud():Double{
        var long=0.0
        long=2* PI*this.radio
        return long
    }


    override fun toString():String{
        var res="Radio: $radio Centro: $centro Punto: $punto Longitud: "+this.longitud()
        return res
    }

}