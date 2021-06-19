package comportamental.exemplos

class ErrorLogger(override var level: Int) : AbstractLogger() {

    override fun write(message: String?) = println("Error Console::Logger:$message")

}