package comportamental.exemplos

class Originator{

    lateinit var state:String

    fun saveStateToMemento(): MementoPattern = MementoPattern(state)
    fun getStateFromMemento(memento: MementoPattern){
        state = memento.state
    }
}