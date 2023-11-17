package com.example.ejercicioclase

import kotlin.math.PI

open class Circunferencia(radio:Double,centro:Double,punto:Double) {
    var radio=radio
    var centro=0.0
    var punto=0.0
    constructor() : this()


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