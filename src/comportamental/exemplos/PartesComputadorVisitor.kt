package comportamental.exemplos

interface PartesComputadorVisitor{
    fun visit(computador: Computador)
    fun visit(monitor: Monitor)
    fun visit(teclado: Teclado)
    fun visit(mouse: Mouse)
}