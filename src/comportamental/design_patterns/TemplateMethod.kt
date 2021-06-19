package comportamental.design_patterns

import comportamental.exemplos.Football
import comportamental.exemplos.Game
import comportamental.exemplos.Volei

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:39
 */

fun main() {

    var game: Game = Volei()
    game.play()
    println()
    game = Football()
    game.play()

    //Saída de dados
    /*
    Volei Game Initialized! Start playing.
    Volei Game Started. Enjoy the game!
    Volei Game Finished!

    Football Game Initialized! Start playing.
    Football Game Started. Enjoy the game!
    Football Game Finished!
    */

}