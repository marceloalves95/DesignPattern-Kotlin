package comportamental.design_patterns

import comportamental.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:38
 */
fun main() {

    val soma = ContextStrategy(Soma())
    println("10 + 5 = ${soma.executeOperation(10.0, 5.0)}")
    val subtracao = ContextStrategy(Subtracao())
    println("10 - 5 = ${subtracao.executeOperation(10.0, 5.0)}")
    val multiplicacao = ContextStrategy(Multiplicacao())
    println("10 * 5 = ${multiplicacao.executeOperation(10.0, 5.0)}")
    val divisao = ContextStrategy(Divisao())
    println("10 / 5 = ${divisao.executeOperation(10.0, 5.0)}")

    //Saída
    //10 + 5 = 15.0
    //10 - 5 = 5.0
    //10 * 5 = 50.0
    //10 / 5 = 2.0

}
