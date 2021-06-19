package comportamental.exemplos

class Football: Game(){

    override fun initialize() = println("Football Game Initialized! Start playing.")
    override fun startPlay() = println("Football Game Started. Enjoy the game!")
    override fun endPlay() = println("Football Game Finished!")

}