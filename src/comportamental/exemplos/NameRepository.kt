package comportamental.exemplos

class NameRepository : Container {

    val names = arrayOf("Roberto", "John", "Julia", "Larissa")

    override fun getIterator(): Iterator {
        return NameIterator()
    }

    inner class NameIterator : Iterator {

        private var index: Int = 0

        override fun hasNext(): Boolean {
            if (index < names.size) {
                return true
            }
            return false
        }

        override fun next(): Any? {
            if (hasNext()) {
                return names[index++]
            }
            return null
        }

    }

}