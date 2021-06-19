package comportamental.design_patterns

import comportamental.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:37
 */
fun main() {

    val estoque = Estoque()

    val comprarPedidosEstoque = ComprarEstoque(estoque)
    val venderPedidosEstoque = VenderEstoque(estoque)

    val corretor = Corretor()
    corretor.levarPedido(comprarPedidosEstoque)
    corretor.levarPedido(venderPedidosEstoque)

    corretor.colocarPedidos()

    //Saida

    //Estoque [Nome: ABC, Quantidade: 10] comprado
    //Estoque [Nome: ABC, Quantidade: 10] vendido

}