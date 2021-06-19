package estrutural.design_patterns

import estrutural.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:35
 */
fun main() {

    val criadorForma = CriadorForma()
    criadorForma.desenharCircle()
    criadorForma.desenharRectangle()
    criadorForma.desenharSquare()

    //Saída

    //Circle::desenhar()
    //Rectangle::desenhar()
    //Square::desenhar()

}