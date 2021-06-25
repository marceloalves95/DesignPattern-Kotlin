package criacao.design_patterns.abstract_factory

/**
 * @author RubioAlves
 * Created 17/06/2021 at 18:07
 */
class RoundedShapeFactory: AbstractFactoryPattern() {

    override fun getShape(shapeType: String): Shape? {
        when (shapeType) {
            "RECTANGLE" -> {
                return RoundedRectangle()
            }
            "SQUARE" -> {
                return RoundedSquare()
            }
        }
        return null
    }
}