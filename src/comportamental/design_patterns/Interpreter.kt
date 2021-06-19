package comportamental.design_patterns

import comportamental.exemplos.AndExpression
import comportamental.exemplos.Expression
import comportamental.exemplos.OrExpression
import comportamental.exemplos.TerminalExpression

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:37
 */
class Interpreter {

    //Regra: Roberto e John são do gênero masculino
    fun getMaleExpression(): Expression {

        val roberto = TerminalExpression("Roberto")
        val john = TerminalExpression("John")

        return OrExpression(roberto, john)

    }
    //Regra: Julia é uma mulher casada
    fun getMarriedWomanExpression(): Expression {

        val julia = TerminalExpression("Julia")
        val married = TerminalExpression("Casada")

        return AndExpression(julia, married)
    }

}
fun main() {

    val isMale = Interpreter().getMaleExpression()
    val isMarriedWoman = Interpreter().getMarriedWomanExpression()

    println("John é do gênero masculino? Resposta: ${isMale.interpret("John")}")
    println("Julia é uma mulher casada? Resposta: ${isMarriedWoman.interpret("Julia Casada")}")

    //Saída

    //John é do gênero masculino? Resposta: true
    //Julia é uma mulher casada? Resposta: true

}