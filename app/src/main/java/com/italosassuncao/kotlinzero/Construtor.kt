package com.italosassuncao.kotlinzero

// Construtor Primário
class Usuario (nome: String, sobrenome: String){

    /* Forma alternativa de passar os paramentros dentro do construtor:
    class Usuario (
        val nome: String,
        val sobrenome: String)

     Assim não sendo necessário utilizar a declaração de variáveis fora do construtor
     */

    var nome: String = ""
    var sobrenome: String = ""

    // Init é utilizado logo após a execução do construtor primário
    init {
        this.nome = nome
        this.sobrenome = sobrenome
        println("Initialized")
        println("Nome: $nome Sobrenome: $sobrenome")
    }

    // Construtor Secundário
    constructor(nome: String): this(nome, "") {
        println("Segundo construtor")
    }

}

fun main() {

    val usuario = Usuario("Italo", "Silva")
    //usuario.nome = "Italo"

}