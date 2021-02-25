import kotlin.math.sqrt

fun main() {

    val a = 1

    val b = 22

    println(a.isSimple())
    println(b.isSimple())

}

fun Int.isSimple(): Boolean {
    if(this < 2)
        return true
    for (i in 2 until sqrt(this.toDouble()).toInt()){
        if(this%i==0)
            return false
    }
    return true
}













