package estrutural.exemplos

class FormaVermelhaDecorator(private val decoratedForma: Shape) : FormaDecorator(decoratedForma) {
    override fun desenhar() {
        decoratedForma.desenhar()
        setBordaVermelha()
    }

    private fun setBordaVermelha() = println("Cor da Borda: Vermelha")

}