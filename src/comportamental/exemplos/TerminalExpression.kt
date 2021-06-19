package comportamental.exemplos

class TerminalExpression(private val data:String): Expression {
    override fun interpret(context: String): Boolean {
        if (context.contains(data)) {
            return true
        }
        return false
    }

}