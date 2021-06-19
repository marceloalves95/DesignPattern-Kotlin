package estrutural.exemplos

class CircleFlyweight(private val color:String): Shape {

    var x:Int = 0
    var y:Int = 0
    var radius:Int = 0

    override fun desenhar() {
        println("CircleFlyweight: Draw() [Color:$color, x:$x, y:$y, radius:$radius]")
    }

}