package comportamental.design_patterns

import comportamental.exemplos.Context
import comportamental.exemplos.IniciarEstado
import comportamental.exemplos.PararEstado

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:38
 */
fun main() {

    val context = Context()

    val iniciarEstado = IniciarEstado()
    iniciarEstado.doAction(context)

    println(context.state.toString())

    val pararEstado = PararEstado()
    pararEstado.doAction(context)

    println(context.state.toString())

    //Saída
    //O jogador iniciou o estado
    //Estado Iniciado
    //O jogador parou o estado
    //Estado Parado

}