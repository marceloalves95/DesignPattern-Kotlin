package estrutural.exemplos

class Empregado(private val nome: String, private val departamento: String, private val salario: Int) {

    private val subordinados: MutableList<Empregado> = ArrayList()

    fun adicionar(e: Empregado) = subordinados.add(e)
    fun getSubordinados(): List<Empregado> = subordinados

    override fun toString(): String = "Empregado:[Nome:$nome, departamento:$departamento, salario:$salario]"

}