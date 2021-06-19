package comportamental.exemplos

class Teclado: PartesComputador {
    override fun aceitar(partesComputadorVisitor: PartesComputadorVisitor) {
        partesComputadorVisitor.visit(this)
    }

}