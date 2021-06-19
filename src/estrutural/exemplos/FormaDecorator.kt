package estrutural.exemplos

abstract class FormaDecorator(private val decoratedForma: Shape) : Shape {
    override fun desenhar() = decoratedForma.desenhar()
}