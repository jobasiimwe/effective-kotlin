
class LimitMutability() {
    fun valCanHoldMutableObject() {
        val list = mutableListOf(1, 2, 3)
        println(list)
        list.add(4)
        println(list)
    }
}
