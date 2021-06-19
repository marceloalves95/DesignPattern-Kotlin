package estrutural.exemplos

class Circulo(private val x: Int, private val y: Int, private val raio: Int, desenhoAPI: DesenhoAPI) : Forma(desenhoAPI) {
    override fun desenhar() = desenhoApi.desenharCirculo(raio, x, y)
}