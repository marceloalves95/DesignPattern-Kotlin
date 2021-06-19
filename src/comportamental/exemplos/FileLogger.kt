package comportamental.exemplos

class FileLogger(override var level: Int) : AbstractLogger() {

    override fun write(message: String?) = println("File::Logger:$message")

}