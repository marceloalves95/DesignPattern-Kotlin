package estrutural.design_patterns

import estrutural.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:34
 */
fun main() {

    val circuloVermelho = Circulo(100, 100, 10, CirculoVermelho())
    val circuloVerde = Circulo(100, 100, 10, CirculoVerde())

    circuloVermelho.desenhar()
    circuloVerde.desenhar()

    //Saída
    //Desenhando Circulo [cor:vermelho, raio: 10, x: 100, y: 100]
    //Desenhando Circulo [cor:verde, raio: 10, x: 100, y: 100]

}