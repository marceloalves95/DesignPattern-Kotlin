package comportamental.exemplos

class ConsoleLogger(override var level: Int) : AbstractLogger() {

    override fun write(message: String?) = println("Standard Console::Logger:$message")

}