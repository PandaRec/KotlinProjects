fun main() {

    val sportsmen = Sportsmen()
    sportsmen.getVodonos(object : Vodonos{
        override fun bringWater() {
            println("bringing water...")

        }
    })


}















