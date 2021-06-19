package comportamental.exemplos

/**
 * @author RubioAlves
 * Created 17/06/2021 at 12:59
 */
class Soma: OperationStrategy {
    override fun doOperation(num1: Double, num2: Double): Double = num1.plus(num2)
}