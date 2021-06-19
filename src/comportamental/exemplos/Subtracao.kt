package comportamental.exemplos

/**
 * @author RubioAlves
 * Created 17/06/2021 at 13:00
 */
class Subtracao: OperationStrategy {
    override fun doOperation(num1: Double, num2: Double): Double = num1.minus(num2)
}