package comportamental.exemplos

class VenderEstoque(private val estoque: Estoque) : Pedido {
    override fun executar() = estoque.vender()
}