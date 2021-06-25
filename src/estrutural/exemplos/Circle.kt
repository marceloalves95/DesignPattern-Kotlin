package estrutural.exemplos

import criacao.design_patterns.abstract_factory.Shape

class Circle: Shape {
    override fun draw() = println("Circle::desenhar()")
}