import kotlin.random.Random

fun main() {
    val list= List(100){Random.nextInt(0,100)}

    println(modifyList(list) { it.sum() })



}

inline fun modifyList (list: List<Int>,modify:(List<Int>)->Int): Int{
    return modify(list)
}











