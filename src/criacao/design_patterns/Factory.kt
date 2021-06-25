package criacao.design_patterns

import criacao.design_patterns.factory.ShapeFactory

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:32
 */
fun main() {

    val shapeFactory = ShapeFactory()

    val shape1 = shapeFactory.getShape("CIRCLE")
    shape1?.draw()

    val shape2 = shapeFactory.getShape("RECTANGLE")
    shape2?.draw()

    val shape3 = shapeFactory.getShape("SQUARE")
    shape3?.draw()

}