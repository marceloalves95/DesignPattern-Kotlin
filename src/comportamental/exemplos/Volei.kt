package comportamental.exemplos

class Volei: Game(){

    override fun initialize() = println("Volei Game Initialized! Start playing.")
    override fun startPlay() = println("Volei Game Started. Enjoy the game!")
    override fun endPlay() = println("Volei Game Finished!")


}