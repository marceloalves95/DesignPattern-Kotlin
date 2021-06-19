package comportamental.exemplos

class Estoque {

    private val nome = "ABC"
    private val quantidade = 10

    fun comprar() = println("Estoque [Nome: $nome, Quantidade: $quantidade] comprado")

    fun vender() = println("Estoque [Nome: $nome, Quantidade: $quantidade] vendido")

}