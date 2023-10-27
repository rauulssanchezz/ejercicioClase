package com.example.ejercicioclase

fun main(){
    var lista= mutableListOf<Planeta>(
        Planeta("Miculo","Gaseoso",20000090.5),
        Planeta("Eeeoo","Rocoso",2000.5),
        Planeta("Analis","Gaseoso",70020.5),
        Planeta("OjoRojo","Rocoso",1.0),
        Planeta("Tintin","Rocoso",0.5),
        Planeta("Pepepepepe","Gaseoso",2.5)
    )
    var sistema=SistemaSolar(lista)

    println(sistema.mayorPeso().toString())
    println(sistema.menorPeso().toString())
}