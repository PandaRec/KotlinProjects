
fun main() {



}

inline fun <T,R> myWith(obj:T, operation:T.()->R):R{
    return obj.operation()
}















