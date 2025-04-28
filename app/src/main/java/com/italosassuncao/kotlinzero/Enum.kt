package com.italosassuncao.kotlinzero

import android.net.http.UrlRequest

enum class StatusPedido {
    PEDIDO_PENDENTE,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE
}

class Pedido(var total: Double = 0.0,
             var itens: String = "",
             var status: StatusPedido = StatusPedido.PEDIDO_PENDENTE) {

}

fun main() {

    // Tela de compra
    val pedido = Pedido(125.89, "blusa, sapato")

    //Pagamento
    pedido.status = StatusPedido.PAGAMENTO_CONFIRMADO

    // Transportadora
    pedido.status = StatusPedido.PEDIDO_ENVIADO

    // Historico de pedidos
    if (pedido.status == StatusPedido.PEDIDO_REALIZADO){
        println("Pedido realizado com sucesso!")
    } else if (pedido.status == StatusPedido.PAGAMENTO_CONFIRMADO){
        println("Pagamento confirmado!")
    } else if (pedido.status == StatusPedido.PEDIDO_ENVIADO){
        println("Pedido enviado!")
    }

}