package comportamental

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:38
 */
class Strategy {

    abstract class Felino(private val correrStrategy:CorrerStrategy){

        abstract fun display()
        abstract fun rugir()
        fun perfomarCorrer() = correrStrategy.correr()
        fun getCorrerStrategy(correrStrategy:CorrerStrategy) = correrStrategy.correr()

    }

    class Leao: Felino(CorrerCurtaDistancia()) {

        override fun display() = println("Leão a vista")
        override fun rugir() = println("Urghhhhh!")

    }
    class Leopardo:Felino(CorrerLongaDistancia()){

        override fun display() = println("Leopardo a vista")
        override fun rugir() = println("Arghh!")

    }
    interface CorrerStrategy{
        fun correr()
    }
    class CorrerCurtaDistancia:CorrerStrategy{
        override fun correr() = println("Correr curta distância, porém com o objetivo bem próximo.")
    }
    class CorrerLongaDistancia:CorrerStrategy{
        override fun correr() = println("Correr longa distância, caso necessário.")
    }

}
