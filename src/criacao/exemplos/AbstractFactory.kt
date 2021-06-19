package criacao.exemplos

/**
 * @author RubioAlves
 * Created 17/06/2021 at 18:01
 */
abstract class AbstractFactory {
    abstract fun getForma(tipoForma:String):Forma?
}