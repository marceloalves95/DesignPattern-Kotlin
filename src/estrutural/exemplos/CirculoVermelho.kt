package estrutural.exemplos

class CirculoVermelho : DesenhoAPI {
    override fun desenharCirculo(raio: Int, x: Int, y: Int) = println("Desenhando Circulo [cor:vermelho, raio: $raio, x: $x, y: $y]")
}