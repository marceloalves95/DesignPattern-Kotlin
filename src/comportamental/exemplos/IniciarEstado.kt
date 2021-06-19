package comportamental.exemplos

class IniciarEstado : State {
    override fun doAction(context: Context) {
        println("O jogador iniciou o estado")
        context.state = this
    }

    override fun toString(): String = "Estado Iniciado"

}