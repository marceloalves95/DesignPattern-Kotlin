package comportamental.exemplos

class PararEstado : State {
    override fun doAction(context: Context) {
        println("O jogador parou o estado")
        context.state = this
    }

    override fun toString(): String = "Estado Parado"

}