package estrutural.exemplos

import criacao.design_patterns.abstract_factory.Shape

class Square: Shape {
    override fun draw() = println("Square::desenhar()")
}