package comportamental.design_patterns

import comportamental.exemplos.*


/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:39
 */
fun main() {

    val computador: PartesComputador = Computador()
    computador.aceitar(ParteComputadorDisplayVisitor())

    //Saída

    //Displaying Mouse.
    //Displaying Teclado.
    //Displaying Monitor.
    //Displaying Computador.

}