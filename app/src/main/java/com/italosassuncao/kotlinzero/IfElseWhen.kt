package com.italosassuncao.kotlinzero

fun main() {

    /*val notaAluno = 5
    val condicao = notaAluno >= 6

    val opcao = 1

    if (opcao == 1) {
        println("Cartão de crédito")
    }else if (opcao == 2){
        println("Extrato Bancário")
    }else if (opcao == 3){
        println("Poupança")
    }else {
        println("Opção inválida")
    }
     */

    val opcao = 1

    when(opcao) {
        1 -> println("Cartão de crédito")
        2 -> println("Extrato Bancário")
        3 -> println("Poupança")
        else -> println("Opção inválida")
    }
}