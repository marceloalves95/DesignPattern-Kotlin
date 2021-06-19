package comportamental.design_patterns

import comportamental.exemplos.BinaryObserver
import comportamental.exemplos.HexaObserver
import comportamental.exemplos.OctalObserver
import comportamental.exemplos.Sujeito

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:38
 */
fun main() {

    val sujeito = Sujeito()
    HexaObserver(sujeito)
    OctalObserver(sujeito)
    BinaryObserver(sujeito)

    println("O primeiro estado muda para: 15")
    sujeito.state = 15
    println("O segundo estado muda para: 10")
    sujeito.state = 10

    //Saída

    //O primeiro estado muda para: 15
    //Hexa String: F
    //Octal String: 17
    //Binary String: 1111

    //O segundo estado muda para: 10
    //Hexa String: A
    //Octal String: 12
    //Binary String: 1010

}