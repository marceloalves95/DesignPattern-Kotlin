package comportamental.design_patterns

import comportamental.exemplos.ClienteAbstrato
import comportamental.exemplos.ClienteNulo
import comportamental.exemplos.ClienteReal

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:42
 */
class NullObject {

    companion object {

        val listaNomes = listOf("Lucas", "João", "Maria")

        fun getCliente(nome: String): ClienteAbstrato {

            listaNomes.forEach { nomes ->

                if (nomes == nome) {
                    return ClienteReal(nome)
                }

            }

            return ClienteNulo()

        }
    }

}

fun main() {

    val cliente1 = NullObject.getCliente("Lucas")
    val cliente2 = NullObject.getCliente("Marcelo")
    val cliente3 = NullObject.getCliente("Maria")
    val cliente4 = NullObject.getCliente("Matheus")

    println("Clientes")
    println()
    println(cliente1.getNome())
    println(cliente2.getNome())
    println(cliente3.getNome())
    println(cliente4.getNome())

    //Saída
    //Clientes

    //Lucas
    //Não existe esse nome na lista
    //Maria
    //Não existe esse nome na lista

}
