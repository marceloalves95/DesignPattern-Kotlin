package criacao.design_patterns.factory

import criacao.design_patterns.abstract_factory.Rectangle
import criacao.design_patterns.abstract_factory.Shape
import criacao.design_patterns.abstract_factory.Square

class ShapeFactory{
    fun getShape(shapeType:String): Shape? {
        when {
            shapeType.equals("CIRCLE", true) -> {
                return Circle()
            }
            shapeType.equals("RECTANGLE", true) -> {
                return Rectangle()
            }
            shapeType.equals("SQUARE", true) -> {
                return Square()
            }
            else -> shapeType.let {
                return null
            }
        }
    }
}