package com.italosassuncao.kotlinzero

fun main() {

    /*val nomes = arrayOf("Italo", "João", "Maria")

    println(nomes[0])*/

    /*var numero = 1
    while (numero <= 10) {
        println("Executou: $numero")
        numero++
    }*/

    /*for (numero in 1..10) {
        println("Executou: $numero")
    }*/

    val postagens = arrayOf("Viagem para a praia", "Meu cachorro", "Festa de aniversário")

    for ((indice, postagem) in postagens.withIndex()) {
        println("Titulo: $postagem")
    }

}