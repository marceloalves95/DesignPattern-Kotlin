package estrutural.design_patterns

import estrutural.exemplos.Empregado

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:34
 */
fun main() {

    val ceo = Empregado("João", "CEO", 30000)
    val chefeVendas = Empregado("Roberto", "Chefe de Vendas", 20000)
    val chefeMarkerting = Empregado("Michel", "Chefe de Markerting", 20000)

    val escriturario1 = Empregado("Laura", "Marketing", 10000)
    val escriturario2 = Empregado("Bob", "Marketing", 10000)

    val executivoVendas1 = Empregado("Richard", "Vendas", 10000)
    val executivoVendas2 = Empregado("Lucas", "Vendas", 10000)

    ceo.adicionar(chefeVendas)
    ceo.adicionar(chefeMarkerting)

    chefeVendas.adicionar(executivoVendas1)
    chefeVendas.adicionar(executivoVendas2)

    chefeMarkerting.adicionar(escriturario1)
    chefeMarkerting.adicionar(escriturario2)

    //Lista com todos os empregados da empresa
    println(ceo)
    ceo.getSubordinados().forEach { chefeEmpregados->

        println(chefeEmpregados)

        chefeEmpregados.getSubordinados().forEach { empregado -> println(empregado)}

    }

    //Saída

    //Empregado:[Nome:João, departamento:CEO, salario:30000]
    //Empregado:[Nome:Roberto, departamento:Chefe de Vendas, salario:20000]
    //Empregado:[Nome:Richard, departamento:Vendas, salario:10000]
    //Empregado:[Nome:Lucas, departamento:Vendas, salario:10000]
    //Empregado:[Nome:Michel, departamento:Chefe de Markerting, salario:20000]
    //Empregado:[Nome:Laura, departamento:Marketing, salario:10000]
    //Empregado:[Nome:Bob, departamento:Marketing, salario:10000]

}