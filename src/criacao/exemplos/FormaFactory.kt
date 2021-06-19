package criacao.exemplos

class FormaFactory{
    fun getForma(tipoForma:String): Forma? {
        when {
            tipoForma.equals("CIRCULO", true) -> {
                return Circulo()
            }
            tipoForma.equals("RETANGULO", true) -> {
                return Retangulo()
            }
            tipoForma.equals("QUADRADO", true) -> {
                return Quadrado()
            }
            else -> tipoForma.let {
                return null
            }
        }
    }
}