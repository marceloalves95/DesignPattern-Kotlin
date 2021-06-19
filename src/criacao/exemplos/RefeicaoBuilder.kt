package criacao.exemplos

class RefeicaoBuilder{

    fun prepararRefeicaoVegetariana(): Refeicao {

        val refeicao = Refeicao()
        refeicao.addItem(HamburguerVegetariano())
        refeicao.addItem(Cola())

        return refeicao
    }

    fun prepararRefeicaoNaoVegetariana(): Refeicao {

        val refeicao = Refeicao()
        refeicao.addItem(HamburguerFrango())
        refeicao.addItem(Pepsi())

        return refeicao
    }
}