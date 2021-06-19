package comportamental.exemplos

abstract class AbstractLogger {

    companion object {
        const val INFO = 1
        const val DEBUG = 2
        const val ERROR = 3
    }

    var nextLogger: AbstractLogger? = null

    open var level = 0

    open fun logMessage(level: Int, message: String?) {
        if (this.level <= level) {
            write(message)
        }
        nextLogger?.logMessage(level, message)
    }

    protected abstract fun write(message: String?)

}