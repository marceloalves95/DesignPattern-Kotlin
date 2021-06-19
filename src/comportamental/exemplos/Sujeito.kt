package comportamental.exemplos

class Sujeito {
    private val observers: MutableList<Observer> = ArrayList()
    var state = 0
        set(state) {
            field = state
            notifyAllObservers()
        }

    fun attach(observer: Observer) = observers.add(observer)
    private fun notifyAllObservers() = observers.forEach { observer -> observer.atualizar() }

}