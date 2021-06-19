package comportamental.design_patterns

import comportamental.exemplos.Usuario

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:37
 */
fun main() {

    val robert = Usuario("Roberto")
    val john = Usuario("John")

    robert.enviarMensagem("Olá! John")
    john.enviarMensagem("Oi! Roberto")

}