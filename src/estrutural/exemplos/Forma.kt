package estrutural.exemplos

abstract class Forma(protected val desenhoApi: DesenhoAPI) {
    abstract fun desenhar()
}