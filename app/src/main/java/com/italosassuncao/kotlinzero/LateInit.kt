package com.italosassuncao.kotlinzero

class Produto {

    lateinit var descricao: String

}

fun main() {

    val produto = Produto()
    produto.descricao = "Camiseta"
    println(produto.descricao)

}