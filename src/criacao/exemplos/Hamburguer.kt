package criacao.exemplos

abstract class Hamburguer: Item {
    override fun embalagem(): Embalagem = Embrulho()
}