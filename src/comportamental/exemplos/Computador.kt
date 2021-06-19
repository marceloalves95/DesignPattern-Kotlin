package comportamental.exemplos

class Computador: PartesComputador {

    private val partes: Array<PartesComputador> = arrayOf(Mouse(), Teclado(), Monitor())

    override fun aceitar(partesComputadorVisitor: PartesComputadorVisitor) {

        partes.forEach { partesComputador -> partesComputador.aceitar(partesComputadorVisitor) }
        partesComputadorVisitor.visit(this)
    }

}