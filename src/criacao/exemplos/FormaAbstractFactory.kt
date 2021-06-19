package criacao.exemplos

/**
 * @author RubioAlves
 * Created 17/06/2021 at 18:02
 */
class FormaAbstractFactory:AbstractFactory(){

    override fun getForma(tipoForma: String): Forma? {
        when (tipoForma) {
            "RETANGULO" -> {
                return Retangulo()
            }
            "QUADRADO" -> {
                return Quadrado()
            }
        }
        return null
    }
}