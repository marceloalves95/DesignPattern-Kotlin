package comportamental.exemplos

class CareTaker{

    private val mementoList:MutableList<MementoPattern> = arrayListOf()

    fun add(state: MementoPattern) = mementoList.add(state)
    fun getIndex(index:Int): MementoPattern = mementoList[index]

}