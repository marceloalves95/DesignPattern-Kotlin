package comportamental.design_patterns

import comportamental.exemplos.NameRepository

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:37
 */
fun main() {

    val namesRepository = NameRepository()

    val iterator = namesRepository.getIterator()

    while (iterator.hasNext()){
        val name = iterator.next() as String
        println("Nome: $name")
    }

    //Saída

    //Nome: Roberto
    //Nome: John
    //Nome: Julia
    //Nome: Larissa

}
