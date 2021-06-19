package criacao.design_patterns

import criacao.exemplos.FactoryProducer

/**
 * @author RubioAlves
 * Created 17/06/2021 at 17:58
 */
fun main() {

    //Pega a formFactory
    val formaFactory = FactoryProducer.getFactory(false)
    //Pega um objeto com forma retangular
    val forma1 = formaFactory.getForma("RETANGULO")
    //Chama o metodo desenhar do formato retangular
    forma1?.desenhar()
    //Pega um objeto com forma quadrada
    val forma2 = formaFactory.getForma("QUADRADO")
    //Chama o metodo desenhar do formato quadrado
    forma2?.desenhar()

    //Pega a formFactory
    val formaFactory1 = FactoryProducer.getFactory(true)
    //Pega um objeto com forma retangular
    val forma3 = formaFactory1.getForma("RETANGULO")
    //Chama o metodo desenhar do formato retangular
    forma3?.desenhar()
    //Pega um objeto com forma quadrada
    val forma4 = formaFactory1.getForma("QUADRADO")
    //Chama o metodo desenhar do formato quadrado
    forma4?.desenhar()

    //Saída
    //Dentro Retangulo::desenhar() method.
    //Dentro Quadrado::desenhar() method.
    //Dentro RetanguloArredondado::desenhar() method.
    //Dentro QuadradoArredondado::desenhar() method.

}