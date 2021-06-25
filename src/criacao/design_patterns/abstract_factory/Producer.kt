package criacao.design_patterns.abstract_factory

/**
 * @author RubioAlves
 * Created 17/06/2021 at 18:09
 */
class Producer {
    fun getFactory(rounded:Boolean): AbstractFactoryPattern {
        return if (rounded){
            RoundedShapeFactory()
        } else{
            ShapeFactory()
        }
    }
}