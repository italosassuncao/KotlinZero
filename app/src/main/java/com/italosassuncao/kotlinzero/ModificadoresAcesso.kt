package com.italosassuncao.kotlinzero

open class Carro {

    //var modelo = ""

    private fun injetarCombustivel(){
        println("Injeção de combustivel")
    }

    fun acelerar(){
        injetarCombustivel()
        println("Acelerando")
    }

}

class onix: Carro() {

}

fun main() {

    val onix = Carro()
    onix.acelerar()

    /*val carro = Carro()
    carro.acelerar()*/
    //carro.acelerar()

}