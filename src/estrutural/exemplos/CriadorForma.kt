package estrutural.exemplos

import criacao.exemplos.Forma

class CriadorForma: Formas {

    private val circle: Forma = Circle()
    private val rectangle: Forma = Rectangle()
    private val square: Forma = Square()

    override fun desenharCircle() = circle.desenhar()
    override fun desenharRectangle() = rectangle.desenhar()
    override fun desenharSquare() = square.desenhar()
}