package estrutural.exemplos

import criacao.design_patterns.abstract_factory.Shape

class Rectangle: Shape {
    override fun draw() = println("Rectangle::desenhar()")
}