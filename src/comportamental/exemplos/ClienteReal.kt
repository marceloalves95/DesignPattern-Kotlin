package comportamental.exemplos

class ClienteReal(private var nome:String): ClienteAbstrato(){

    override fun isNulo(): Boolean = false
    override fun getNome(): String = nome

}