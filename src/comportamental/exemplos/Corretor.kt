package comportamental.exemplos

class Corretor {

    private val listaPedidos: MutableList<Pedido> = ArrayList()

    fun levarPedido(pedido: Pedido) {
        listaPedidos.add(pedido)
    }

    fun colocarPedidos() {

        listaPedidos.forEach { pedido -> pedido.executar() }
        listaPedidos.clear()

    }
}