package estrutural.exemplos

class CirculoVerde : DesenhoAPI {
    override fun desenharCirculo(raio: Int, x: Int, y: Int) = println("Desenhando Circulo [cor:verde, raio: $raio, x: $x, y: $y]")
}