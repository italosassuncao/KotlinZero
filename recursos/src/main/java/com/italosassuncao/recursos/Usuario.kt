package com.italosassuncao.recursos

class Usuario {

    internal var nome = "" // Internal permite usar o recurso apenas dentro do módulo

    fun calcularPrecoCorrida(){
        println("Calculando preço da corrida")
    }

}