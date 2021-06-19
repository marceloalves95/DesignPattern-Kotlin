package criacao.exemplos

class ColorStore {

    private val colorMap: MutableMap<String, Color> = HashMap()

    fun getColor(colorName: String): Color = colorMap[colorName]!!.clone() as Color

    init {
        colorMap["blue"] = BlueColor()
        colorMap["black"] = BlackColor()
    }
}