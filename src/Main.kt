import kotlin.random.Random

val list: MutableList<Int>? = mutableListOf()
fun main() {

list?.let {
    with(it) {
        for (i in 0 until 1000)
            add(Random.nextInt(0, 1000))
        val result = it.filter { it%2==0 }.take(100)
        result.forEach { println(it) }
    }
}


}











