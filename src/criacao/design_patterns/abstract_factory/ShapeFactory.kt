package criacao.design_patterns.abstract_factory

import criacao.design_patterns.factory.Circle

/**
 * @author RubioAlves
 * Created 20/06/2021 at 13:10
 */
class ShapeFactory:AbstractFactoryPattern() {
    override fun getShape(shapeType: String): Shape? {
        when (shapeType) {
            "RECTANGLE" -> {
                return Rectangle()
            }
            "SQUARE" -> {
                return Square()
            }
            "CIRCLE" -> {
                return Circle()
            }
        }
        return null
    }
}