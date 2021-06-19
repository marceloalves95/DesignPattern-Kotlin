package comportamental.exemplos

import java.util.*

class HexaObserver(private val sujeito: Sujeito) : Observer() {

    init {
        sujeito.attach(this)
    }

    override fun atualizar() = println("Hexa String: ${Integer.toHexString(sujeito.state).uppercase(Locale.getDefault())}")

}