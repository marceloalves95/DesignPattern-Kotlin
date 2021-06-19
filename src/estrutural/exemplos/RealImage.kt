package estrutural.exemplos

class RealImage(private val fileName: String) : Image {

    init {
        loadFromDisk(fileName)
    }

    override fun display() = println("Displaying: $fileName\n")

    private fun loadFromDisk(fileName: String) = println("Loading $fileName")

}