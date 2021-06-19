package estrutural.design_patterns

import estrutural.exemplos.CircleFlyweight
import estrutural.exemplos.ShapeFactory


/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:35
 */
class Flyweight {

    private val colors = arrayOf("Red", "Green", "Blue", "White", "Black")

    fun getRandomColor():String = colors[(Math.random() * colors.size).toInt()]
    fun getRandomX():Int = (Math.random() * 100).toInt()
    fun getRandomY():Int = (Math.random() * 100).toInt()

}

fun main() {

    for (i in 0..19){
        val circle = ShapeFactory().getCircle(Flyweight().getRandomColor()) as CircleFlyweight
        circle.x = Flyweight().getRandomX()
        circle.y = Flyweight().getRandomY()
        circle.radius = 100
        circle.desenhar()
    }

}