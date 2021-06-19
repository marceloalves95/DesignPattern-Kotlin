package comportamental.design_patterns

import comportamental.exemplos.AbstractLogger
import comportamental.exemplos.AbstractLogger.Companion.DEBUG
import comportamental.exemplos.AbstractLogger.Companion.ERROR
import comportamental.exemplos.AbstractLogger.Companion.INFO
import comportamental.exemplos.ConsoleLogger
import comportamental.exemplos.ErrorLogger
import comportamental.exemplos.FileLogger

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:36
 */
class ChainOfResponsibility {

    fun getChainOfLoggers(): AbstractLogger {

        val errorLogger = ErrorLogger(ERROR)
        val fileLogger = FileLogger(DEBUG)
        val consoleLogger = ConsoleLogger(INFO)

        errorLogger.nextLogger = fileLogger
        fileLogger.nextLogger = consoleLogger

        return errorLogger

    }

}

fun main() {

    val loggerChain = ChainOfResponsibility().getChainOfLoggers()
    loggerChain.logMessage(INFO, "This is an information.")
    loggerChain.logMessage(DEBUG, "This is an debug level information.")
    loggerChain.logMessage(ERROR, "This is an error information.")

    //Saída

    //Standard Console::Logger:This is an information.
    //File::Logger:This is an debug level information.
    //Standard Console::Logger:This is an debug level information.
    //Error Console::Logger:This is an error information.
    //File::Logger:This is an error information.
    //Standard Console::Logger:This is an error information.

}