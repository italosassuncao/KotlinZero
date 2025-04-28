package com.italosassuncao.kotlinzero

class Carro(var modelo: String = "", var velocidade: Int = 0) {
    fun exibirInformacoes() {
        println("Modelo: $modelo e $velocidade km/h")
    }

    companion object {
        const val VELOCIDADE_MAXIMA = 120
        fun exibirMensagemVelocidadeMaxima() {
            println("Velocidade Maxima: $VELOCIDADE_MAXIMA km/h")
        }
    }

}

class UsuarioN {
    companion object {
        fun verificarUsuarioLogado(): Boolean {
            return true
        }
    }
}

fun main() {

    val retorno = UsuarioN.verificarUsuarioLogado()
    println("Usuario logado: $retorno")

    /*println("Velocidade Maxima: ${Carro.VELOCIDADE_MAXIMA} km/h")

    val celta = Carro("Celta", 185)
    celta.exibirInformacoes()

    val uno = Carro("Uno", 180)
    uno.exibirInformacoes()*/

}

