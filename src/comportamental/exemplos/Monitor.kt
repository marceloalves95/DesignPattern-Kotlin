package comportamental.exemplos

class Monitor: PartesComputador {
    override fun aceitar(partesComputadorVisitor: PartesComputadorVisitor) {
        partesComputadorVisitor.visit(this)
    }

}