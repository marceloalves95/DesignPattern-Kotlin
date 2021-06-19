package estrutural.design_patterns

import estrutural.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:35
 */
fun main() {

    val circulo = CirculoDecorator()
    val circuloVermelho = FormaVermelhaDecorator(CirculoDecorator())
    val retanguloVermelho = FormaVermelhaDecorator(Retangulo())
    println("Circulo com a borda normal")
    circulo.desenhar()

    println("\nCirculo com a borda Vermelha")
    circuloVermelho.desenhar()

    println("\nRetângulo com a borda Vermelha")
    retanguloVermelho.desenhar()

    //Saída

    //Circulo com a borda normal
    //Forma: Circulo

    //Circulo com a borda Vermelha
    //Forma: Circulo
    //Cor da Borda: Vermelha

    //Retângulo com a borda Vermelha
    //Forma: Retângulo
    //Cor da Borda: Vermelha

}