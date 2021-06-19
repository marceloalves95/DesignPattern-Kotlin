package comportamental.exemplos

class ComprarEstoque(private val estoque: Estoque) : Pedido {
    override fun executar() = estoque.comprar()

}