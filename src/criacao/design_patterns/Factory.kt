package criacao.design_patterns

import criacao.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:32
 */
fun main() {

    val formaFactory = FormaFactory()
    //Pega o objeto Circulo e chama o metodo desenhar
    val forma1 = formaFactory.getForma("CIRCULO")
    forma1?.desenhar()
    //Pega o objeto Retangulo e chama o metodo desenhar
    val forma2 = formaFactory.getForma("RETANGULO")
    forma2?.desenhar()
    //Pega o objeto Quadrado e chama o metodo desenhar
    val forma3 = formaFactory.getForma("QUADRADO")
    forma3?.desenhar()

    //Saída
    //Dentro Circulo::desenhar() method.
    //Dentro Retangulo::desenhar() method.
    //Dentro Quadrado::desenhar() method.

}