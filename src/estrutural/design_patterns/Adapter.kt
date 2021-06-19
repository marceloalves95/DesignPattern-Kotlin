package estrutural.design_patterns

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:34
 */
class Adapter {

    interface Pato {
        fun grasnar()
        fun voar()
    }

    class PatoMarreco : Pato {
        override fun grasnar() = println("Quack, quack, quack")
        override fun voar() = println("Voar, voar, voar")
    }

    interface Peru {
        fun soar()
        fun voar()
    }

    class PeruAustraliano : Peru {
        override fun soar() = println("Blulu, brulu, brulu")
        override fun voar() = println("Voar")
    }

    class PeruAdapter(private val peru: Peru) : Pato {

        override fun grasnar() = peru.soar()
        override fun voar() = peru.voar()

    }

}

fun main() {

    val patoMarreco = Adapter.PatoMarreco()
    val peru = Adapter.PeruAustraliano()

    val peruAdapter = Adapter.PeruAdapter(peru)

    val patos = arrayOf(patoMarreco, peruAdapter)

    patos.forEach { pato->
        pato.grasnar()
        pato.voar()
    }

    //Saida

    //Quack, quack, quack
    //Voar, voar, voar
    //Blulu, brulu, brulu
    //Voar

}