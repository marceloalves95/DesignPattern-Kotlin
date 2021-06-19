package comportamental.exemplos

/**
 * @author RubioAlves
 * Created 17/06/2021 at 13:05
 */
class ContextStrategy(private val strategy: OperationStrategy) {

    fun executeOperation(num1:Double, num2:Double):Double = strategy.doOperation(num1, num2)

}