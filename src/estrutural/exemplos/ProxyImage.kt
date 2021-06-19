package estrutural.exemplos

class ProxyImage(private val fileName: String) : Image {

    private var realImage: RealImage? = null
    override fun display() {

        if (realImage == null) {
            realImage = RealImage(fileName)
        }
        realImage!!.display()
    }

}