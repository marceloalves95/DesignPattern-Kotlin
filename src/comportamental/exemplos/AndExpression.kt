package comportamental.exemplos

class AndExpression(private val firstExpression: Expression, private val secondExpression: Expression): Expression {
    override fun interpret(context: String): Boolean = firstExpression.interpret(context) && secondExpression.interpret(context)
}