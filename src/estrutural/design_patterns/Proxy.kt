package estrutural.design_patterns

import estrutural.exemplos.ProxyImage

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:35
 */
fun main() {

    val image = ProxyImage("MinhaFoto.png")

    //Imagem será lida pelo disco
    image.display()
    //Imagem não será lida pelo disco
    image.display()

}