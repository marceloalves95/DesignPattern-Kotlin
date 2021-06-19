package criacao.exemplos

/**
 * @author RubioAlves
 * Created 17/06/2021 at 18:07
 */
class FormaArredondadoFactory:AbstractFactory() {

    override fun getForma(tipoForma: String): Forma? {
        when (tipoForma) {
            "RETANGULO" -> {
                return RetanguloArredondado()
            }
            "QUADRADO" -> {
                return QuadradoArredondado()
            }
        }
        return null
    }
}