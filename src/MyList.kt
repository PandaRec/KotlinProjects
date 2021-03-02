interface MyList<T> {
    fun get(index:Int):T
    fun add(obj:T)
    fun remove(obj:T)
    fun removeAt(index:Int)
    fun size():Int
}