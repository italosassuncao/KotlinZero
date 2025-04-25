package com.italosassuncao.kotlinzero

interface Presidenciavel { // Interface e seus métodos são abstratos
    fun candidatarSe()
}

abstract class Pessoa { // Superclasse

    fun comer() = println("Comendo")
    //abstract fun candidatarSe()

}

class DesenvolvedorAndroid: Pessoa() {
    fun programar() = println("Programando em Android")
}
class DesenvolvedorWeb: Pessoa() {
    fun programar() = println("Programando em Web")
}
class Jornalista: Pessoa(), Presidenciavel {
    fun escrever() = println("Escrevendo")
    override fun candidatarSe() {
        println("Candidatado a presidente")
    }
}
class FuncionarioPublico: Pessoa() {}

fun main() {

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()

    println("******")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatarSe()

    println("******")

}