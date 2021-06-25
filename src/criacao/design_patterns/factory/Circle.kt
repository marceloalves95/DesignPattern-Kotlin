package criacao.design_patterns.factory

import criacao.design_patterns.abstract_factory.Shape

class Circle: Shape {
    override fun draw() = println("Inside Circle::draw() method.")
}