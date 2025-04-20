package com.italosassuncao.kotlinzero

import androidx.core.os.trace

class Jogador{

    var kart = "Padrão"
    var pneu = "Terra"
    var planador = "Asa de pombo"

    fun acelerar(aceleracao: Int){

        println("Acelerando o carro")

    }

    fun retornaPoder(): String{
        return "Casco verde"
    }

}

fun main() {

    val jogador = Jogador()
    jogador.kart = "Padrão"
    jogador.acelerar(60)

    val poder = jogador.retornaPoder()
    println(poder)

    println(jogador.kart)

}