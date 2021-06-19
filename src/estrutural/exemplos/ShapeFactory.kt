package estrutural.exemplos

class ShapeFactory{
    private val circleMap: HashMap<*, *> = HashMap<Any?, Any?>()

    fun getCircle(color: String): Shape {
        var circle = circleMap[color] as CircleFlyweight?

        if (circle == null){
            circle = CircleFlyweight(color)
            println("Criando a cor do circulo: $color")
        }
        return circle
    }
}