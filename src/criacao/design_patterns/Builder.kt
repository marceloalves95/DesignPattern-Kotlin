package criacao.design_patterns

import criacao.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:32
 */
fun main() {

    val refeicaoBuilder = RefeicaoBuilder()

    val refeicaoVegetariana = refeicaoBuilder.prepararRefeicaoVegetariana()
    println("Refeição Vegetariana")
    refeicaoVegetariana.mostrarItens()
    println("Custo total: ${refeicaoVegetariana.getCusto()}\n")

    val refeicaoNaoVegetariana = refeicaoBuilder.prepararRefeicaoNaoVegetariana()
    println("Refeição Não Vegetariana")
    refeicaoNaoVegetariana.mostrarItens()
    println("Custo total: ${refeicaoNaoVegetariana.getCusto()}")

    //Saída
    //Refeição Vegetariana
    //Item: Hamburguer Vegetariano, Embalagem: Embrulho, Preço: 25.0
    //Item: Coca Cola, Embalagem: Garrafa, Preço: 30.0
    //Custo total: 55.0

    //Refeição Não Vegetariana
    //Item: Hamburguer de Frango, Embalagem: Embrulho, Preço: 50.5
    //Item: Pepsi, Embalagem: Garrafa, Preço: 35.0
    //Custo total: 85.5

}