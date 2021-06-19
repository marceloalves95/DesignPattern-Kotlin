package comportamental.exemplos

class ClienteNulo: ClienteAbstrato(){

    override fun isNulo(): Boolean = true
    override fun getNome(): String = "Não existe esse nome na lista"

}