package criacao.design_patterns.abstract_factory

/**
 * @author RubioAlves
 * Created 17/06/2021 at 18:01
 */
abstract class AbstractFactoryPattern {
    abstract fun getShape(shapeType:String): Shape?
}