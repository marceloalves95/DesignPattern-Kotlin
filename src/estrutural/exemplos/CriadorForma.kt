package estrutural.exemplos

import criacao.design_patterns.abstract_factory.Shape

class CriadorForma: Formas {

    private val circle: Shape = Circle()
    private val rectangle: Shape = Rectangle()
    private val square: Shape = Square()

    override fun desenharCircle() = circle.draw()
    override fun desenharRectangle() = rectangle.draw()
    override fun desenharSquare() = square.draw()
}