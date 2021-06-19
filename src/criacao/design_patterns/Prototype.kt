package criacao.design_patterns

import criacao.exemplos.ColorStore


/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:33
 */
fun main() {

    ColorStore().getColor("blue").addColor()
    ColorStore().getColor("black").addColor()
    ColorStore().getColor("black").addColor()
    ColorStore().getColor("blue").addColor()

}