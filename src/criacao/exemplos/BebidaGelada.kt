package criacao.exemplos

abstract class BebidaGelada: Item {
    override fun embalagem(): Embalagem = Garrafa()
}