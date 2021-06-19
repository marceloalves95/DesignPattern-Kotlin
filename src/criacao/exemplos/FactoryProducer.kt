package criacao.exemplos

/**
 * @author RubioAlves
 * Created 17/06/2021 at 18:09
 */
class FactoryProducer {
    companion object{
        fun getFactory(arrendondado:Boolean):AbstractFactory{
            return if (arrendondado){
                FormaArredondadoFactory()
            } else{
                FormaAbstractFactory()

            }
        }
    }
}