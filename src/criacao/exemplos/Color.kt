package criacao.exemplos

abstract class Color : Cloneable{

    abstract fun addColor()

    override fun clone(): Any {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return clone!!
    }
}