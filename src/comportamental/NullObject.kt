package comportamental

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:42
 */

class NullObject {

    abstract class ClienteAbstrato{

        abstract fun isNulo():Boolean
        abstract fun getNome():String
    }
    class ClienteReal(private var nome:String):ClienteAbstrato(){

        override fun isNulo(): Boolean = false
        override fun getNome(): String = nome

    }
    class ClienteNulo:ClienteAbstrato(){

        override fun isNulo(): Boolean = true
        override fun getNome(): String = "Não existe esse nome na lista"

    }
    class ClienteFactory{

        companion object Fabrica{

            val listaNomes = listOf("Lucas", "João", "Maria")

            fun getCliente(nome:String):ClienteAbstrato{

                listaNomes.forEach { nomes->

                    if (nomes == nome) {
                        return ClienteReal(nome)
                    }

                }

                return ClienteNulo()

            }
        }
    }

}
