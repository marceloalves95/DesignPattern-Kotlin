package comportamental.exemplos

class BinaryObserver(private val sujeito: Sujeito) : Observer() {

    init {
        sujeito.attach(this)
    }

    override fun atualizar() = println("Binary String: ${Integer.toBinaryString(sujeito.state)}\n")

}