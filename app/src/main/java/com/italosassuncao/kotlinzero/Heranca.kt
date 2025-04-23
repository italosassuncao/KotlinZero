package com.italosassuncao.kotlinzero

open class Animal {

    var cor: String = ""
    var tamanho: String = ""
    var peso: Double = 0.0

    open fun correr() = println("Correr como um ")
    fun dormir() = println("O animal está dormindo")
    fun comer() = println("O animal está comendo")

}

class Cachorro: Animal() { // Subclasse ou classe filha

    fun latir() = println("O cachorro está latindo")
    override fun correr() {
        super.correr()
        println("cachorro de quatro patas")
    }

}

class Passaro: Animal() {// Subclasse ou classe filha

    fun voar() = println("O passaro está voando")
    override fun correr() {
        super.correr()
        println("passáro de duas patas")
    }

}

fun main() {

    val cachorro = Cachorro()
    cachorro.correr()
    cachorro.latir()

    val passaro = Passaro()
    passaro.correr()
    passaro.voar()

}