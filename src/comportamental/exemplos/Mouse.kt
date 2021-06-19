package comportamental.exemplos

class Mouse: PartesComputador {
    override fun aceitar(partesComputadorVisitor: PartesComputadorVisitor) {
        partesComputadorVisitor.visit(this)
    }

}