
fun main() {

val address1 = AddressWithoutData("city1","street1",1)
    val address2 = address1.copy()

    println(address1)
    println(address2)
    println("hash 1 = ${address1.hashCode()}")
    println("hash 2 = ${address2.hashCode()}")
    println(address1==address2)//equals in java compare by objects
    println(address1===address2) // compare by links




}















