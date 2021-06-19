package comportamental.exemplos

class ParteComputadorDisplayVisitor: PartesComputadorVisitor {

    override fun visit(computador: Computador) = println("Displaying Computador.")
    override fun visit(monitor: Monitor) = println("Displaying Monitor.")
    override fun visit(teclado: Teclado) = println("Displaying Teclado.")
    override fun visit(mouse: Mouse) = println("Displaying Mouse.")

}