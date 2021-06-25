package criacao.design_patterns

import criacao.design_patterns.abstract_factory.Producer

/**
 * @author RubioAlves
 * Created 17/06/2021 at 17:58
 */
fun main() {

    val shapeFactory1 = Producer().getFactory(false)

    val shape1 = shapeFactory1.getShape("RECTANGLE")
    shape1?.draw()

    val shape2 = shapeFactory1.getShape("SQUARE")
    shape2?.draw()


    val shapeFactory2 = Producer().getFactory(true)

    val shape3 = shapeFactory2.getShape("RECTANGLE")
    shape3?.draw()

    val shape4 = shapeFactory2.getShape("SQUARE")
    shape4?.draw()

}