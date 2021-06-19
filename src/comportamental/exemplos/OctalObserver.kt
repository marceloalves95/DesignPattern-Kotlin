package comportamental.exemplos

class OctalObserver(private val sujeito: Sujeito) : Observer() {

    init {
        sujeito.attach(this)
    }

    override fun atualizar() = println("Octal String: ${Integer.toOctalString(sujeito.state)}")

}